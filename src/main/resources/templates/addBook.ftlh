<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
<head>
    <title>
        Bookimori
    </title>
</head>
<body>
<h3>Добавить книгу</h3>
<form action="/book/adding" method="post" enctype="multipart/form-data">
    Название: <input type="text" name="title"/><br><br>
    Автор: <input type="text" name="author"/><br><br>
    Описание: <input type="text" name="description"/><br><br>
    Оценка <input type="number" name="rating"/><br><br>
    Обложка: <input type="file" name="file"/><br><br>
    <input type="submit" value="Добавить">
</form>
<body>