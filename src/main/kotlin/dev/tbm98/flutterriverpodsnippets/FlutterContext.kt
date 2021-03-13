package dev.tbm98.flutterriverpodsnippets

import com.intellij.codeInsight.template.TemplateActionContext
import com.intellij.codeInsight.template.TemplateContextType

class FlutterContext private constructor() :
    TemplateContextType("FLUTTER_RIVERPOD_SNIPPETS", "Flutter riverpod snippets") {
    override fun isInContext(templateActionContext: TemplateActionContext): Boolean {
        return templateActionContext.file.name.endsWith(".dart")
    }
}
