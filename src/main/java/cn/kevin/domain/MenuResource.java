package cn.kevin.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by yongkang.zhang on 2017/5/26.
 */
public class MenuResource {

    private Long id; // 主键
    private Long parent_id; // 父节点ID
    private Long root_id; // 一级菜单ID
    private Integer is_leaf; // 是否是叶子节点(功能节点):0.否/1.是
    private String resource_name; // 资源名称
    private String resource_url; // 资源URL地址
    private String authority_code; // 权限码
    private Integer is_show; // 是否显示:0.不显示/1.显示
    private Integer resource_order; // 排序编号
    private Date created; // 创建时间
    private Date modified; // 修改时间
    private String resource_code; // 资源编码
    private String bury_code; // 埋点码
    private Integer is_inset_sys; // 是否是嵌入系统:0.否/1.是
    private List<MenuResource> children;


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "id=" + id +
                ", parent_id='" + parent_id + '\'' +
                ", root_id='" + root_id + '\'' +
                ", is_leaf='" + is_leaf + '\'' +
                ", resource_name='" + resource_name + '\'' +
                ", resource_url=" + resource_url +
                ", authority_code='" + authority_code + '\'' +
                ", is_show='" + is_show + '\'' +
                ", resource_order=" + resource_order +
                ", resource_code='" + resource_code + '\'' +
                ", bury_code='" + bury_code + '\'' +
                ", is_inset_sys='" + is_inset_sys + '\'' +
                '}' + super.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

    public Long getRoot_id() {
        return root_id;
    }

    public void setRoot_id(Long root_id) {
        this.root_id = root_id;
    }

    public Integer getIs_leaf() {
        return is_leaf;
    }

    public void setIs_leaf(Integer is_leaf) {
        this.is_leaf = is_leaf;
    }

    public String getResource_name() {
        return resource_name;
    }

    public void setResource_name(String resource_name) {
        this.resource_name = resource_name;
    }

    public String getResource_code() {
        return resource_code;
    }

    public void setResource_code(String resource_code) {
        this.resource_code = resource_code;
    }

    public String getResource_url() {
        return resource_url;
    }

    public void setResource_url(String resource_url) {
        this.resource_url = resource_url;
    }

    public String getAuthority_code() {
        return authority_code;
    }

    public void setAuthority_code(String authority_code) {
        this.authority_code = authority_code;
    }

    public String getBury_code() {
        return bury_code;
    }

    public void setBury_code(String bury_code) {
        this.bury_code = bury_code;
    }

    public Integer getIs_show() {
        return is_show;
    }

    public void setIs_show(Integer is_show) {
        this.is_show = is_show;
    }

    public Integer getResource_order() {
        return resource_order;
    }

    public void setResource_order(Integer resource_order) {
        this.resource_order = resource_order;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Integer getIs_inset_sys() {
        return is_inset_sys;
    }

    public void setIs_inset_sys(Integer is_inset_sys) {
        this.is_inset_sys = is_inset_sys;
    }

    public List<MenuResource> getChildren() {
        return children;
    }

    public void setChildren(List<MenuResource> children) {
        this.children = children;
    }

    public void addChild(MenuResource menuResource) {
        if (this.children == null) {
            children = new ArrayList<>();
            children.add(menuResource);
        } else {
            children.add(menuResource);
        }
    }
}
