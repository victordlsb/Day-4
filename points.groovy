class Point{
	int x;
	int y;

	double distanceTo(Point point){

	}

	double distanceToOrigin(){

	}

	void moveTo(double x, double y){

	}

	void moveTo(Point){

	}

	Point clone(){

	}

	Point opposite(){

	}
}


Point point = new Point();
Point auxPoint = new Point();

print("Insert the x coordinate of the point: ");
point.x = Double.parseDouble(System.console().readLine());
print("Insert the y coordinate of the point: ");
point.y = Double.parseDouble(System.console().readLine());
boolean keepRunning = true;
int option;
int x;
int y;

while (keepRunning){
	println ("");
	println ("");
	println ("Choose what do you want to do:");
	println ("1- Calculate the distance to another point");
	println ("2- Calculate the distance to the origin");
	println ("3- Change the position to a x and y position");
	println ("4- Change the position to another point");
	println ("5- Clone the current point");
	println ("6- Clone the current point at the opposite coordinates");
	println ("0- Exit the program");
	option = Integer.parseInt(System.console().readLine());
	println ("\n");
	switch (option){
		case 1: 
			print("Insert the x coordinate of the second point: ");
			auxPoint.x = Double.parseDouble(System.console().readLine());
			print("Insert the y coordinate of the second point: ");
			auxPoint.y = Double.parseDouble(System.console().readLine());
			println ("The distance of the first to the second point is: " + point.distanceTo(auxPoint));
			break;
		
		case 2:
			println ("The distance to the origin is: " + point.distanceToOrigin());
			break;
		
		case 3:
			print("Insert the x coordinate: ");
			x = Double.parseDouble(System.console().readLine());
			print("Insert the y coordinate: ");
			y = Double.parseDouble(System.console().readLine());
			point.moveTo(x,y);
			println ("The coordinates has been changed");
			break;
			
		case 4:
			print("Insert the x coordinate of the second point: ");
			auxPoint.x = Double.parseDouble(System.console().readLine());
			print("Insert the y coordinate of the second point: ");
			auxPoint.y = Double.parseDouble(System.console().readLine());
			point.moveTo(auxPoint);
			println ("The point has been moved to the second point");
			break;
		
		case 5:			
			auxPoint = point.clone();
			println("The point has been succesfully cloned");
			break;
		
		case 6:
			auxPoint = point.opposite();
			println ("The point at the opposite coordinates has been succesfully created");
			break;
			
		case 0:
			keepRunning = false;
			println ("Good bye! :)");
			
			break;
		
		default:
			println ("The option entered is invalid");
			break;
	}
}
			