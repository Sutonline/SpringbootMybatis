package cn.kevin.controller;

import cn.kevin.dao.mapper.MenuResourceMapper;
import cn.kevin.domain.MenuResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yongkang.zhang on 2017/5/26.
 */
@RestController
@RequestMapping(value = "/menu")
public class MenuResourceController {

    @Autowired
    private MenuResourceMapper menuResourceMapper;

    @GetMapping(value = "/queryAll")
    public MenuResource queryAll() {
        List<MenuResource> menuResources = menuResourceMapper.selectAll();
        MenuResource menuResource = new MenuResource();
        menuResource.setId(0L);
        getChildren(menuResources, menuResource);
        return menuResource;
    }

    private void getChildren(List<MenuResource> list, MenuResource parent) {
        if (parent == null || list == null || list.size() == 0) {
            return;
        }
        list.forEach(menuResource -> {
            if (menuResource.getParent_id() == parent.getId()) {
                parent.addChild(menuResource);
                getChildren(list, menuResource);
            }
        });
    }

}
