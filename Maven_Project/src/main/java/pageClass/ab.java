package pageClass;

public class ab {

	public static void main(String[] args) 
	{
		Sheet s;

	    FileInputStream fi = new FileInputStream("C:\\Users\\yirsh\\Desktop\\UAT WEBSHOP.xls");
	    Workbook w = Workbook.getWorkbook(fi);
	    s = w.getSheet(1);
	    int z=s.getRows();
	    System.out.println("no of Users:"+z);
	    driver.get("http://RexelQAEnv:Rexel!23@52.19.191.249/aus/");
	    driver.manage().window().maximize();
	    //Thread.sleep(10000);

	    for(int row=1; row <= 10; row++)
	    {String username = s.getCell(2,row).getContents();
        System.out.println("Username: "+username);
        driver.findElement(By.id("j_username_leftAside")).sendKeys(username);

        String password= s.getCell(3,row).getContents();
        System.out.println("Password: "+password);
        driver.findElement(By.id("j_password_leftAside")).sendKeys(password);
        
        
        
        
        if(driver.getPageSource().contains("Willkommen"))
        {
            System.out.println("Login Sucessfull");
            // write code for logout
        }
        else
        {
        System.out.println("Login Failed");
        }


     }
      driver.quit();
    }
	
	Workbook work = WorkbookFactory.create(myFile);
	Sheet mySheet = work.getSheet("Sheet1");
	Row myRow = mySheet.getRow(1);
	Cell myCell = myRow.getCell(1);
	CellType cellInfo = myCell.getCellType();
	System.out.println(cellInfo);
	System.out.println("===============================");
	// code for reading multiple date from excel
	Sheet mySheet1 = work.getSheet("Sheet2");
	for(int i=0;i<=1;i++)// outer for loop for rows
	{
	for(int j=0;j<=2;j++)// inner for loop for cells
	{
	String value =
	mySheet1.getRow(i).getCell(j).getStringCellValue();
	System.out.print(value+" ");
	}
	System.out.println();
        
        
        
        

	}

}
