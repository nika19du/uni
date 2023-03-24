<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-WGtda1nDnPyuVfTwFZZ44L//VnW9x1yj++7Q2oFjv0JW6TZ+0zUhr2QKjNF5X5l6" crossorigin="anonymous">
    <link rel='stylesheet' type='text/css' href='styles.css' />
    <title>Users Control</title>
</head>
<body>
    <div id="form">
        <h2>Въвеждане на имена</h2>
        <div >
            <form action="form.php" method="POST" class="myform">
                <div>
                    <div>
                        <label>Име</label>
                        <input type="text" name="firstName" placeholder="Enter first name"> 
                    
                        <label>Фамилия</label>
                        <input type="text" name="lastName" placeholder="Enter last name"> 
                    </div>
                </div>
                <div>
                    <div>
                        <label>Име</label>
                        <input type="text" name="firstName2" placeholder="Enter first name"> 
                
                        <label>Фамилия</label>
                        <input type="text" name="lastName2" placeholder="Enter last name"> 
                    </div>
                </div>
                <div>
                    <div>
                        <label>Име</label>
                        <input type="text" name="firstName3" placeholder="Enter first name"> 
                    
                        <label>Фамилия</label>
                        <input type="text" name="lastName3" placeholder="Enter last name"> 
                    </div>
                </div>
                <input type="submit" name="submit" value="Submit">
            </form>
            <hr>

            <!-- Right side data from file -->
            <?php
            // Load the data from the file, or initialize an empty array
            $data= file_exists('data.json')
            ? json_decode(file_get_contents('data.json'),true)
            : array();
                        //display the data as a table
                        echo '<table>';
                        echo '<thead><tr><th>First Name</th><th>Last Name</th><tr></thead>';
                        echo '<tbody>';
                        if (is_array($data)) { // Make sure $data is an array
                            foreach ($data as $row){
                                echo '<tr>';
                                foreach($row as $cell){
                                    echo '<td>' . $cell . '</td>';
                                }
                                echo '</tr>';
                            }
                        }
                        echo '</table>';
                
            ?>
        </div>
    </div>
</body>
</html>