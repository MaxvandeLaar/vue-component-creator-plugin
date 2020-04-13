package fabs.vue.component.data;

import fabs.util.AbstractOptions;
import org.jdom.Element;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ComponentCreateOptions extends AbstractOptions {
    public static final String STORE_KEY = "vcc.component";

    private final String defaultComponentTemplateFile = "templates/component/{{componentName}}.vue.mustache";
    private final String defaultSassTemplateFile = "templates/component/_{{componentName}}.scss.mustache";

    private String componentTemplateFile = defaultComponentTemplateFile;
    private String sassTemplateFile = defaultSassTemplateFile;

    private String componentName;

    @Override
    public ArrayList<String> getFiles() {
        ArrayList<String> files = new ArrayList<>();
        files.add(componentTemplateFile);
        files.add(sassTemplateFile);
        return files;
    }

    @Override
    public Map<String, Object> getTemplateVariables() {
        Map<String, Object> templateModel = new HashMap<>();
        templateModel.put("componentName", componentName);
        return templateModel;
    }

    @Override
    public Element serialize() {
        return null;
    }

    @Override
    public void deserialize(Element element) {

    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }
}
