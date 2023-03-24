<?php
    $errMsg=null;
    $arr=file_exists('data.json')
    ? json_decode(file_get_contents('data.json'),true)
    : array();

    if($_SERVER['REQUEST_METHOD']=='POST'){
        $name=$_POST["name"];
        $ocenki=$_POST["ocenki"]; 

        if(empty($name) && empty($ocenki)){
            $errMsg ="Попълнете формата! <br>";
        }else{
            if(empty($name)){
                $errMsg .="Не сте въвели име! <br>";
            }else if(empty($ocenki)){
                $errMsg .="Не сте въвели оценки! <br>";
            }
        }
        if ($errMsg){
            echo "<span class='errMsg' style='color:red'>$errMsg</span>";
        } 
        else{
           // $arr=[$name=>$ocenki];
            $arr[$name]=$ocenki;
            file_put_contents('data.json',json_encode($arr));
        }
    }
    if($arr!=null){
        echo "<table class='table container'>";
        foreach($arr as $name => $ocenki){
            echo "<tr><td>".$name."</td><td>".$ocenki."</td></tr>";
        }
        echo "</table>";
    }

    $arr2 = array("Peter"=>"3", "Ben"=>"4", "Joe"=>"4");
     foreach($arr2 as $k => $value) {
        echo "Key=" . $k . ", Value=" . $value;
        echo "<br>";
    }

?>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Pre Kontrolna01 demo</title>
        <link rel="stylesheet" href="node_modules/bootstrap/dist/css/bootstrap.min.css">
    </head>
    <body> 
        <div class="container">
            <h1>Create User</h1>
            <form method="POST">

                <div class="form-group">
                    <label>Username</label>
                    <input type="text" name="name" class="form-control" placeholder="Enter username"/>
                </div>
                <div class="form-group">
                    <label>Ocenki</label>
                    <input type="text" name="ocenki" class="form-control" placeholder="Enter ocenki"/>
                </div>
                <br/>
                <input type="submit" value="Submit" class="btn btn-block btn-primary"/>
            </form>
        </div>
    </body>
    <script src="node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
</html>