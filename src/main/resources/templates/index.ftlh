<#import "/spring.ftl" as spring />

<!DOCTYPE html>

<html lang="de">
<head>
    <title>Homepage</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>

<h1><@spring.message "welcome"/></h1>

<a href="cities">Städte anzeigen</a>

<br><br>

<#--
Dies prüft, ob das Attribut des Objekts nicht null ist:

    <#if object.attribute??></#if>

Dies prüft, ob das Objekt oder das Attribut nicht null ist (Klammern verwenden):

    <#if (object.attribute)??></#if>
-->

<#if firstName??>
<#-- Gastmann hier ist der Default-Wert -->
    Hallo ${firstName} ${lastName!"Gastmann"}, Wie geht's?
    <br>
    UserId: ${userId!""}
</#if>

<#--
    <#if condition>
        ...
    <#elseif condition2>
        ...
    <#elseif condition3>
        ...
    <#else>
        ...
    </#if>
-->

<br>
Heute ist: ${.now?string["dd.MM.yyyy"]}

</body>

</html>