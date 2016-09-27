import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * Created by zhangzh on 2016/9/6.
 */
public class Biz {


    private Dao dao;

    public void insert(String id, String name, String type) {

        if (StringUtils.isAnyBlank(id, name, type)) {
            return;
        }

        BeanEntity bean = new BeanEntity();
        bean.setBeanType(type);
        bean.setBeanId(id);
        bean.setBeanName(name);
        dao.insert(bean);
    }

    public void remove(String id) {
        if (StringUtils.isBlank(id)) {
            return;
        }
        dao.remove(id);
    }

    public void update(String name, String type) {
        if (StringUtils.isAnyBlank(name, type)) {
            return;
        }
        dao.update(name, type);
    }

    public String finds(String name) {
        if (StringUtils.isBlank(name)) {
            return null;
        }
        List<BeanEntity> beans = dao.finds(name);

        StringBuilder sb = new StringBuilder();
        sb.append("#");
        for (BeanEntity bean : beans) {
            sb.append(bean.getBeanType()).append("#");
        }

        return sb.toString();
    }


    public Dao getDao() {
        return dao;
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }

}
