<?php

function sum($x=0,$y=0){
    echo  "sum of ".$x." ".$y." is ".($x+$y)."\n";
}

sum(5,10);
sum(); //default value is taken as zero

?>