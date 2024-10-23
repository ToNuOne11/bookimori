<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
<head>
  <title>
    Bookimori
  </title>
</head>
<body>
<h3>
  <img src="/image/${book.getCover().id}" height="250px" /> <br><br>
  Название:  ${book.title} <br>
</h3>
  <h4>Автор:   ${book.author} <br></h4>
<h5>Описание:   ${book.description} <br> </h5>
Оценка:   ${book.rating} <br>
<hr>
<form class="deleteButton" action="/book/delete/${book.id}" method="post">
  <input type="submit" value="Удалить"/>
</form>
</body>
  
</html>