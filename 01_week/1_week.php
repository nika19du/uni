
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP & MySQL</title>
</head>
<body>
    <h1>Избираеми дисциплини</h1>
    <form action="file01-1.php" method="post">
        Име: <input type="text" name="firstName" for="firstName">
        Фамилия: <input type="text" name="lastName" for="lastName"> <br><br>
        Курс: <input type= "number" for="course" name="course" value="1" max="5" step="1" maxlength="1"> <br><br>

        Специалност: <input type="radio" for="spec" name="spec" value="СТД"> СТД
        Специалност: <input type="radio" for="spec" name="spec" value="БИТ"> БИТ
        Специалност: <input type="radio" for="spec" name="spec" value="Информатика"> Информатика
        <br>
        <u>Избираеми дисциплини</u>
        <select for="subject" name="subject" multiple>
            <option value="Математика">Математика</option>
            <option value="Програмиране на JavaScript">Програмиране на  JavaScript
            </option>
            <option value="Програмиране на C#">Програмиране на  C#
            </option>
            <option value="ООП">ООП</option>
        </select></br><br>
        <input type="submit" value="Изпрати" />
    </form>
</body>
</html>