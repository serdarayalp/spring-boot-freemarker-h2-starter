<!DOCTYPE html>
<html lang="de">
<head>
    <title>Cities</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css">
</head>

<body>

<h2>Liste der Städte</h2>

<@city_list id="Id" name="Name" einwohner="Einwohner"/>

<#macro city_list id name einwohner>
    <table>
        <tr>
            <th>${id}</th>
            <th>${name}</th>
            <th>${einwohner}</th>
        </tr>
        <#list cities as city>
            <tr>
                <td>${city.id}</td>
                <td>${city.name}</td>
                <td>${city.population?c}</td>
            </tr>
        </#list>
    </table>
</#macro>

<#macro list title items>
    <h2>${title?cap_first}</h2>
    <ul>
        <#list items as item>
        <li>${item?cap_first}
            </#list>
    </ul>
</#macro>

<@list title="animals" items=["mouse", "elephant", "python"]/>

<h2>Liste der Autos:</h2>

<@img src="images/ferrari.jpg" width=400 height=250 alt="Ferrari"/>

<#macro img src parameters...>
    <img src="${src}"
    <#list parameters as attrName, attrVal>
        ${attrName}="${attrVal}"
    </#list>>
</#macro>

<br/>

<#list cars>
    <table>
        <tr>
            <th>Marke</th>
            <th>Model</th>
            <th>Zulassung</th>
        </tr>
        <#items as car>
            <tr>
                <td>${car.marke}</td>
                <td>${car.model}</td>
                <td>${car.zulassung?c}</td>
            </tr>
        </#items>
    </table>
<#else>Momentan ist kein Auto zu finden...
</#list>

</body>
</html>