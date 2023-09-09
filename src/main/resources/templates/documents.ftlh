<!DOCTYPE html>
<html>
<head>
    <title>Регистрация Проектов</title>
</head>
<body>
<h1>Организаторы проектов</h1><hr>
<h4>Все записи об активистах, являющихся организаторами проектов</h4>

<form action="/" method="get">
    Поиск по студенческому номеру студента: <input type="text" name="num"><br>
    <input type="submit" value="Показать результаты"/>
</form>

<#list documents as document>
    <div>
        <p><b>${document.last} ${document.first}</b>  Проект: ${document.project}  | <a href="/document/${document.id}">Подробнее...</a></p>
    </div>
</#list>
<hr>
<h3>Добавить новую запись</h3>
<form action="/document/create" method="post">
    Имя: <input type="text" name="first"/><br><br>
    Фамилия: <input type="text" name="last"/><br><br>
    Номер студенческого: <input type="number" name="num"/><br><br>
    Факультет/Комитет: <input type="text" name="fac"/><br><br>
    Название проекта: <input type="text" name="project"/><br><br>
    Дата проведения: <input type="text" name="day"/><br><br>
    <input type="submit" value="Добавить студента"/>
</form>
</body>
</html>