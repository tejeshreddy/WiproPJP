import java.io.*;
import java.util.*;
class mini_project_1
{
    public static void main(String[] args)
        {
            System.out.println("Emp No\tEmp Name\tjoin date\tDesignation Code\tDepartment\tBasic\tHRA\tIT");
            String arr[][]={{"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},
                            {"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
                            {"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
                            {"1004","Chahat","29/01/2013","r","Front","Desk","12000","6000","2000"},
                            {"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
                            {"1006","Suman","1/1/2000","e","Manufacturing","23000","9000","4400"},
                            {"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}};
            
            
            /*for(int i=0;i<7;i++)
            {
                for(int j=0;j<7;j++)
                {
                    System.out.print(arr[i][j]+"\t");
                }
                System.out.println();
            }*/
            Scanner br=new Scanner(System.in);
            System.out.println("Enter the Id: ");
            String id=br.next();
            int basic=0,hra=0,it=0,da=0;
            String designation="";
            for(int i=0;i<7;i++)
            {
                if(arr[i][0].equals(id))
                {
                    designation=arr[i][3];
                    basic=Integer.parseInt(arr[i][5]);
                    hra=Integer.parseInt(arr[i][6]);
                    it=Integer.parseInt(arr[i][7]); 
                }
            }

                switch(designation)
                {
                    case "e":
                        da=20000;
                        break;
                    case "c":
                        da=32000;
                        break;
                    case "k":
                        da=12000;
                        break;
                    case "r":
                        da=15000;
                        break;
                    case "m":
                        da=40000;
                        break;
                }

                System.out.println(basic+hra-it+da);
        }
}


