
void main(){
  dynamic checkint(int n){
    if(n<0){
      throw Exception("Value Must Be Greater than Zero");
    }
  }

  void check(var val){
    var value;
    try{
      value=checkint(val);
    }
    catch(e){
      print(e);
    }

    finally{
      if(value == null){
        print("Value not Accepted");
      }
      else{
        print("Value Verified $value");
      }
  }
  

  }

  check(-1);

  
 
}
