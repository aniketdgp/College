<?php

$x = 10;
$y = 20;
$z = 50;

function calculatE(){ /* classes functions are not case sesnitive but variable and keywords are case sensitive*/

    global $x,$y,$z;
    $z = $z+$y;
    
}

Calculate();

echo $z;


?>