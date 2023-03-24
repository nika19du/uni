<?php
    $data= file_exists('data.json')
        ? json_decode(file_get_contents('data.json'),true)
        : array();
    if(isset($_POST['submit'])){
        $fName1=$_POST['firstName'];
        $lName1=$_POST['lastName'];

        $fName2=$_POST['firstName2'];
        $lName2=$_POST['lastName2'];

        $fName3=$_POST['firstName3'];
        $lName3=$_POST['lastName3'];

        $data[] = array($fName1,$lName1);
        $data[]=array($fName2,$lName2);
        $data[]=array($fName3,$lName3);

        file_put_contents('data.json',json_encode($data));
    }
    echo '<a href="index.php"> Go back </a><br/><br/>';
    echo '*Total: '. count($data);
    echo '<hr/>';
    //display the data as a table
    echo '<div class="container-sm"><table >';
    echo '<thead><tr><th>First Name</th><th>Last Name</th><tr></thead>';
    echo '<tbody></div>';
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