<?php

class car{

    function car(){
        $this->brand = "Audi";
        $this->model = "Vs4";
    }

}

$aniket = new car();
echo $aniket->model.$aniket->brand;



?>