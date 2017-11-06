<?xml version="1.0"?>
<recipe>

    <#if generateViewModel>
      <instantiate from="src/app_package/Kotlin MVVM View Model.kt"
                    to="${escapeXmlAttribute(srcOut)}/${name}ViewModel.kt" />
    </#if>

    <#if viewType='activity'>
      <instantiate from="src/app_package/Kotlin MVVM Activity View.kt"
                     to="${escapeXmlAttribute(srcOut)}/${name}Activity.kt" />
    </#if>

    <open file="${srcOut}/${name}Activity.kt"/>
</recipe>
