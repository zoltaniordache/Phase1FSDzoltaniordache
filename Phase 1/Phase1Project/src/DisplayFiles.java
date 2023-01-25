import java.io.File;
    		import java.util.Arrays;
public class DisplayFiles {

	public static void main() {
		
		 

			File folder = new File(System.getProperty("user.dir"));



        if(folder.isDirectory())
        {
            File[] fileList = folder.listFiles();
            Arrays.sort(fileList);
            System.out.println("\nTotal number of items present in the directory: " + fileList.length );
            for(File file:fileList)
            {
                System.out.println(file.getName());
            }

  

        } 

	}
	public static void main(File folder) {
		
		

    if(folder.isDirectory())
    {
        File[] fileList = folder.listFiles();
        Arrays.sort(fileList);
        System.out.println("\nTotal number of items present in the directory: " + fileList.length );
        for(File file:fileList)
        {
            System.out.println(file.getName());
        }
        


    }


}

}
