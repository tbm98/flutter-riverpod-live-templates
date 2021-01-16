import com.intellij.codeInsight.template.TemplateContextType;
import com.intellij.codeInsight.template.TemplateActionContext;
import org.jetbrains.annotations.NotNull;

public class FlutterContext extends TemplateContextType {
    protected FlutterContext() {
        super("FLUTTER_RIVERPOD_SNIPPETS", "Flutter riverpod snippets");
    }

    @Override
    public boolean isInContext(@NotNull TemplateActionContext templateActionContext) {
        return templateActionContext.getFile().getName().endsWith(".dart");
    }
}
