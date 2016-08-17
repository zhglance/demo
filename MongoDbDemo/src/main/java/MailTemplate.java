/**
 * Created by zhangzh on 2016/8/15.
 */
public class MailTemplate {
    private String templateType;
    private String templateJetx;

    public MailTemplate() {
    }

    public MailTemplate(String templateType, String templateJetx) {
        this.templateType = templateType;
        this.templateJetx = templateJetx;
    }

    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public String getTemplateJetx() {
        return templateJetx;
    }

    public void setTemplateJetx(String templateJetx) {
        this.templateJetx = templateJetx;
    }
}
