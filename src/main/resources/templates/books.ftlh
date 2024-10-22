<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
<head>
    <title>
        Bookimori
    </title>
</head>
<body>
<h1>
    Bookimori
</h1><hr>
<form action="/" method="get">
    Поиск: <input type="text" name="title"><br>
    <input type="submit" value="Поиск"/>
</form>
<h4>Список книг</h4>
<#list books as book>
    <div>
        <p>
            <b>${book.title}</b>
            ${book.rating} | <a href ="/book/${book.id}"> <img src="/image/${book.getCover().id}" height="250px" /> <br><br> </a>
        </p>
    </div>
<#else>
    <h3> Ничего не найдено </h3>
</#list>
<hr>
<h3>Добавить книгу</h3>
<form action="/book/adding" method="post" enctype="multipart/form-data">
    Название: <input type="text" name="title"/><br><br>
    Описание: <input type="text" name="description"/><br><br>
    Автор: <input type="text" name="author"/><br><br>
    Оценка <input type="number" name="rating"/><br><br>
    Обложка: <input type="file" name="file"/><br><br>
    <input type="submit" value="Добавить">
</form>
</body>
</html>