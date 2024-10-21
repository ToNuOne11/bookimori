<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
<head>
  <title>
    Bookimori
  </title>
</head>
<body>


<h3>
  <img src="/image/${cover.id}" height="150px" /> <br><br>
Название:  ${book.title} <br>
Описание:   ${book.description} <br>
Оценка:   ${book.rating} <br>
Автор:   ${book.author} <br>
</h3>
<hr>
<form action="/book/delete/${book.id}" method="post">
  <input type="submit" value="Удалить"/>
</form>
</body>
</html>