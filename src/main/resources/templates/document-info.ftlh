<!DOCTYPE html>
<html>
<head>
    <title>Регистрация Проектов</title>
</head>
<body>
<h1>Организаторы проектов</h1><hr>
<h4>Подробная информация об активисте Студенческого Совета</h4>
<b>Имя: </b>${document.first}<br>
<b>Фамилия: </b>${document.last}<br>
<b>Номер студенческого: </b>${document.num}<br>
<b>Факультет/Комитет: </b>${document.fac}<br>
<b>Название проекта: </b>${document.project}<br>
<b>Дата проведения: </b>${document.day}<br>
<hr>
<form action="/document/delete/${document.id}" method="post">
    <input type="submit" value="Удалить организатора из этого проекта"/>
</form>
</body>
</html>