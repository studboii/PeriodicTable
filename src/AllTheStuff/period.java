package AllTheStuff;

import java.util.*;
//Program to display elements
class period
{

static String nm[]= {"Hydrogen ","Helium","Lithium", "Beryllium", "Boron","Carbon",
          "Nitrogen","Oxygen","Fluorine","Neon","Sodium","Magnesium",
          "Aluminum","Silicon","Phosphorous","Sulpher","Chlorine","Argon",
          "Potassium","Calcium","Scandium","Titanium","Vandium","Chromium",
          "Manganese","Iron","Cobalt","Nickel","Copper","Zinc","Gallium",
          "Germanium","Arsenic","Selenium","Bromine","Krypton","Rubidium",
          "Strontium","Yttrium","Zicronium","Niobium","Molybdenum",
          "Technetium","Ruthenium","Rhodium","Palladium","Silver","Cadium",
          "Indium","Tin","Antimony","Tellurium","Iodine","Xenon","Caesium",
          "Barium","Lanthanum","Cerium","Presodymium","Neodymium",
          "Promethium","Samarium","Europium","Gadalinium","Terbium",
          "Dysprasium","Halmium","Erbium","Thulium","Ytterbium","Lutetium",
          "Hafnium","Tantalum","Tungsten","Rhenium","Osmium","Iridium",
          "Platinum","Gold","Mercury","Thallium","Lead","Bismuth",
          "Polonium","Astatine","Radon","Francium","Radium","Actinum",
          "Thorium","Protactinium","Uranium","Neptumium","Pluromium",
          "Americium","Curium","Berkelium","Califorium","Einstenium",
          "Fermium","Mendelevium","Nobelium","Lawrencium","Rutherfordium",
          "Dubnium","Seaborgium","Bohrium","Hassium","Meitnerium",
          "Darmstadtium","Roentgenium","Copernicum","Ununtrium",
          "Flerovium","Ununpentium","Livermorium","Ununseptium",
          "Ununoctium"};
static String  syb[]={ "H","He","Li","Be","B","C","N","O","F","Ne","Na","Mg","Al","Si",
            "P","S","Cl","Ar","K","Ca","Sc","Ti","V","Cr","Mn","Fe","Co",
            "Ni","Cu","Zn","Ga","Ge","As","Se","Br","Kr","Rb","Sr","Y","Zi",
            "Nb","Mo","Tc","Ru","Rh","Pd","Ag","Cd","In","Sn","Sb","Te","I",
            "Xe","Cs","Ba","La","Ce","Pr","Nd","Pm","Sm","Eu","Gd","Tb","Dy",
            "Ho","Er","Tm","Yb","Lu","Hf","Ta","W","Re","Os","Ir","Pt","Au",
            "Hg","Ti","Pb","Bi","Po","At","Rn","Fr","Ra","Ac","Th","Pa","U",
            "Np","Pu","Am","Cm","Bk","Cf","Es","Fm","Md","No","Lr","RF","Db",
            "Sg","Bh","Hs","Mt","Ds","Rg","Cn","Uut","Fl","Uup","Lv","Uus",
            "Uuo"};
static float atwt[]={1.008f,4.003f,6.941f,9.012f,10.811f,12.011f,14.007f,15.999f,18.998f,
         20.180f,22.990f,24.305f,26.982f,28.086f,30.974f,32.066f,35.453f,
         39.948f,39.098f,40.078f,44.956f,47.88f,50.942f,51.996f,54.938f,
         55.933f,58.933f,58.693f,63.546f,65.39f,69.732f,72.61f,74.922f,
         78.09f,79.904f,84.80f,84.468f,87.62f,88.906f,91.224f,92.206f,95.94f,
         98.907f,101.07f,102.906f,106.42f,107.868f,112.411f,114.818f,118.71f,
         121.760f,127.6f,126.904f,131.29f,132.905f,137.327f,138.906f,
         140.115f,140.908f,144.24f,144.913f,150.36f,151.966f,157.25f,158.925f,
         162.50f,164.930f,167.26f,168.934f,173.04f,174.967f,178.49f,180.948f,
         183.85f,186.207f,190.23f,192.22f,195.08f,196.967f,200.59f,204.383f,
         207.2f,208.980f,208.982f,209.987f,222.018f,223.020f,226.025f,227.028f,
         232.038f,231.036f,238.029f,237.048f,244.064f,243.061f,247.070f,247.070f,
         251.080f,254.0f,257.095f,258.1f,259.101f,262.0f,261.0f,262.0f,266.0f,264.0f,
         269.0f,268.0f,269.0f,272.0f,277.0f,284.0f,289.0f,288.0f,298.0f};

 static void disp()
{
Scanner obj= new Scanner (System.in);
int n,i,l;
String srch;
int flag=0;
String cao;
System.out.println("\f");
do
{
System.out.println("What do you want to Know");
System.out.println("Elements of ");
System .out.print("Period\n Group\nLanthanide");
System.out.println(" Series\nActinide Series\nor do you want to exit"); 
                                    
System.out.print("Type \" period\" to search for Period or \"group");
System.out.println("\" to search for a group or \n \" Lanthanide\" to search for lanthanide series or \"actinide\" to search for actinide  or \"Exit\" to exit");
srch=obj.next();
if(srch.equalsIgnoreCase("Period"))
{   System.out.println("enter the number");
n=obj.nextInt();
switch(n)
{ case 1 :  period(0,2);
    
    break;
case 2: period(2,10);

    break;
case 3: period(10,18);

    break;
case 4 : period(18,36);

    break;
case 5 : period(36,54);

    break;
case 6: period(54,86);

    break;
case 7 :    period(86,118);

    break;
default: System.out.println(" this period does not exist");
}//switch
} //if
else if(srch.equalsIgnoreCase("Group"))
{ System.out.println("enter the number");
n=obj.nextInt();
        i=0;
    switch (n)
    { case 1: System.out.println("-------------------------------");
            System.out.println("Element Name :  "+nm[0]); //Hyd
            System.out.println("Symbol :  "+syb[0]);
            System.out.println("Atomic  Number : "+1);
            System.out.println(" Atomic weight :  "+ atwt[0]);
            System.out.println("-------------------------------");
            group(10,18,17);

            group(18,36,18);

    group(54,86,32);
   
    break;

case 2:
    for(i=3;;i=11)  // immediately changes value of i for next Iteration
    { 
        l= i+1;
    System.out.println("Type in anything to see the element coming up");
    cao=obj.next();
    System.out.println("-------------------------------");
    System.out.println("Element Name : " +nm[i]); 
    System.out.println("Symbol : "  +syb[i]);
    System.out.println("Atomic  Number : " +l);
    System.out.println(" Atomic weight :  "+ atwt[i]);
    System.out.println("-------------------------------");
    if(i==11)
        break;
    }//first 2 elements 
    group(19,37,18);
   
 group(55,87,32);

break;
case 3:     group(20,38,18);

group(56,69,1);

group(88,102,1);

break;
case 4: group(21,39,18);

group(71,103,32);

break;
case 5: group(22,40,18);

group(72,104,32);

break;
case 6: group(23,41,18);

group(73,105,32);

break;
case 7 : group(24,42,18);


group(74,106,32);

break;
case 8: group(25,43,18);

group(75,107,32);

break;
case 9 : group(26,44,18);

group(76,108,32);

break;
case 10: group(27,45,18);

group(77,109,32);

break;
case 11: group(28,46,18);

    group(79,111,32);

break;
case  12: group(29,47,18);

group(79,111,32);

break;
case 13: 
    
for(i=4;;i=13)
{l= i+1;
System.out.println("Type in anything to see the element coming up");
        cao=obj.next();
        System.out.println("-------------------------------");
    System.out.println("Element Name :  "  +nm[i]); 
    System.out.println("Symbol :  "  +syb[i]);
    System.out.println("Atomic  Number : " +l);
    System.out.println(" Atomic weight :  "+ atwt[i]);
    System.out.println("-------------------------------");
    if(i==13)
        break;
}//first 2 Elements 
group(30,48,18);

group(80,112,32);

break;
case 14: 
    for(i=5;;i=14)
{l= i+1;
System.out.println("Type in anything to see the element coming up");
        cao=obj.next();
        System.out.println("-------------------------------");
System.out.println("Element Name  : "  +nm[i]); 
    System.out.println("Symbol :  "  +syb[i]);
    System.out.println("Atomic  Number : " +l);
    System.out.println(" Atomic weight :  "+ atwt[i]);
    System.out.println("-------------------------------");
    if(i==14)
        break;
}//first 2 Elements 
group(49,81,18);

group(81,113,32);

break;
case 15: 
    for(i=6;;i=15)
{l= i+1;
System.out.println("Type in anything to see the element coming up");
        cao=obj.next();
        System.out.println("-------------------------------");
System.out.println("Element Name  : "  +nm[i]); 
    System.out.println("Symbol : "  +syb[i]);
    System.out.println("Atomic  Number : " +l);
    System.out.println(" Atomic weight :  "+ atwt[i]);
    System.out.println("-------------------------------");
    if(i==15)
        break;
}//first 2 Elements 
group(32,50,18);

group(82,114,32);


break;
case 16: 
    group(7,15,15);

group(33,51,18);

group(83,115,32);


break;
case 17: 
    for(i=8;;i=17)
{l= i+1;
System.out.println("Type in anything to see the element coming up");
        cao=obj.next();
        System.out.println("-------------------------------");
     System.out.println("Element Name :  "  +nm[i]); 
    System.out.println("Symbol : "  +syb[i]);
    System.out.println("Atomic  Number : " +l);
    System.out.println(" Atomic weight : "+ atwt[i]);
    System.out.println("-------------------------------");
    if(i==17)
        break;
}//first 2 Elements 
group(34,52,18);

for(i=84;i<117;i+=32)
{ l= i+1;
System.out.println("Type in anything to see the element coming up");
        cao=obj.next();
        System.out.println("-------------------------------");
System.out.println("Element Name : "  +nm[i]); 
    System.out.println("Symbol : "  +syb[i]);
    System.out.println("Atomic  Number : " +l);
if (i==84)        
System.out.println(" Atomic weight : " + atwt[i]);

else 
System.out.println("Atomic weight is unknown");
System.out.println("-------------------------------");

}    //last 2 Elements
break;
case 18 : System.out.println("-------------------------------");
System.out.println("Element Name : "+nm[1]); 
    System.out.println("Symbol : "+syb[1]);
    System.out.println("Atomic  Number : 2");
    System.out.println(" Atomic weight : "+ atwt[1]);
    System.out.println("-------------------------------");
for(i=9;;i=18)
{l= i+1;
System.out.println("Type in anything to see the element coming up");
        cao=obj.next();
        System.out.println("-------------------------------");
System.out.println("Element Name : "  +nm[i]); 
    System.out.println("Symbol : " +syb[i]);
    System.out.println("Atomic  Number : " +l);
    System.out.println(" Atomic weight : " + atwt[i]);
    System.out.println("-------------------------------");
    if(i==18)
        break;
}//first 2 Elements 
group(35,53,18);


for(i=85;i<118;i+=32)
{ l= i+1;
System.out.println("Type in anything to see the element coming up");
        cao=obj.next();
        System.out.println("-------------------------------");
System.out.println("Element Name :"  +nm[i]); 
    System.out.println("Symbol :"  +syb[i]);
    System.out.println("Atomic  Number : " +l);
    if (i==85)
System.out.println(" Atomic weight " + atwt[i]);
else 
System.out.println(" Atomic weight is unknown");
System.out.println("-------------------------------");
}    //last 2 Elements
break;
default :{
System.out.println("This Group does not exist");
System.out.print(" Please enter the numerical group");
System.out.println(" number");
break;
}//end of default
}//end of switch
}//end of if
else if(srch.equalsIgnoreCase("Lanthanide"))
{ 
period(56,70);

}//end of if
else if(srch.equalsIgnoreCase("Actinide"))
{ 
period(88,103);

}//end of if
else if (srch.equalsIgnoreCase("Exit"))
{ 
System.out.println(" Exiting");
flag=1;
}
else
System.out.println(" Please enter a valid choice");
}while(flag==0); //end of do while
}//end of method
static void period(int i,int j)
{
int l;
for(;i<j;i++)
    { l=i+1;
    System.out.println("-------------------------------");
    System.out.println("element Name   :" +nm[i]);
    System.out.println("Symbol         : "   +syb[i]);
    System.out.println("Atomic  Number : " + l);
    System.out.println(" Atomic weight :" + atwt[i]);
    System.out.println("-------------------------------");        
    }
}
static void group(int i,int j,int k)
{
int l;String cao;
Scanner obj= new Scanner (System.in);
            for(;i<=j;i+=k)
        {l= i+1;
            System.out.println("Type in anything to see the element coming up");
        cao=obj.next();
          System.out.println("-------------------------------");        
        System.out.println("element Name : " +nm[i]); 
            System.out.println("Symbol : "  +syb[i]);
            System.out.println("Atomic  Number :"+l);
            System.out.println(" Atomic weight :"+ atwt[i]);
            
              System.out.println("-------------------------------");        
         
    
            } 

  
}
}//end of class
