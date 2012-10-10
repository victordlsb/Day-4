int binary2decimal (String binary){
	int result = 0;
	for(i = 0;i<binary.length(); i++){
		if (binary.charAt(i) == "1"){
			result = result + Math.pow(2,binary.length()-1-i);
		} else if (binary.charAt(i) != "0"){
			return -1;
		}
	}
	return result;
}

String decimal2binary (int decimal){
	String resultTransposed = "";
	String result = "";
	boolean underOne = false;
	while(!underOne){
		resultTransposed = resultTransposed + Integer.toString(decimal%2);
		decimal=decimal/2;
		if(decimal<1){
			underOne = true;
		}
	}
	for (int i=resultTransposed.length()-1;i>=0;i--){
		result = result + resultTransposed.charAt(i);
	}
	return result;
	
}

boolean correctOption = false;
println("1- Change from Binary to Decimal");
println("2- Change from Decimal to Binary");

while(!correctOption){

	print("Select the option: ");
	int option = Integer.parseInt(System.console().readLine());
	switch(option){
		case 1:
			print("Insert a binary number: ");
			String binary = System.console().readLine();
			int b2dresult = binary2decimal(binary);
			correctOption = true;
			if(b2dresult == -1){
				println ("El numero introducido no es binario");
			}else {
				println (binary + " in decimal system is " + b2dresult);
			}
			break;
		
		case 2: 
			print("Insert a decimal number: ");
			int decimal = Integer.parseInt(System.console().readLine());
			String d2bresult = decimal2binary(decimal);
			correctOption = true;
			println (decimal + " in binary system is " + d2bresult);
			break;
			
		default:
			println ("The option entered is wrong, please reenter it again.");
			break;
	}
}