<#import "/spring.ftl" as spring />

<!DOCTYPE html>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title><@spring.message "label.title"/></title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>

<h2><@spring.message "label.title"/></h2>

<#list products>
    <table>
        <tr>
            <th><@spring.message "label.product.name"/></th>
            <th><@spring.message "label.product.price"/></th>
            <th><@spring.message "label.product.lastUpdated"/></th>
        </tr>
        <#items as product>
            <tr>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.lastUpdated}</td>
            </tr>
        </#items>
    </table>
<#else>Kein Produkt gefunden...
</#list>

</body>
</html>