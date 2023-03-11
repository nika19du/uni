import javax.swing.plaf.synth.SynthSpinnerUI;

public class App {
    public static void main(String[] args) throws Exception {
        
        String[] arr=new String[]{"1","12","12345","123"};
       
       // Recurse(arr);


        //nai golemiq i posle na obratno
        String maxArr=new String();
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].length() > max){
                max=arr[i].length();
                maxArr=arr[i];
            }
        }

        System.out.println(max);
        String over="";
        for(int i=maxArr.length()-1;i>=0;i--) {
            over+=maxArr.charAt(i);
        }

        //Recurse(arr, max, max);

       // System.out.println(Reverse(maxArr));


        String s1="Java";
        String s2="Java";
        String s3="Ja";
        String s4="va";
        String s5=s3+s4;
        if(s1==s5){
            System.out.println("Da");
        }else {
            System.out.println("ne");
        }

        if(s1.equals(s5)){
            System.out.println("S1 e == S5 Da");
        }else {
            System.out.println("ne");
        }
        
        if("Java".equals("JavA")){
            System.out.println("Da");
        }else {
            System.out.println("ne");
        }
        System.out.println(s1);
        System.out.println(s2);
    }

    // private static void Recurse(String[] arr,int max,int index) {
    //     if(arr.length==0){
    //         return;
    //     }
    //     if(arr[index].length()>max){
    //         max=arr[index].length();
    //     }
    //     //System.out.println(arr);
    //     String[] a=new String[]{arr[arr.length-1]};
    //     System.out.println("\n"+a);
    //     Recurse(a,max,a.length+1);
    // }

    private static String Reverse(String str) {
       if((str==null) || (str.length()<=0)){
        return str;
       }else{
        return Reverse(str.substring(1)+str.charAt(0));
       }
    }
}

// Arrange
var configuration = new Configuration { VendorId = 1, CountryId = "US" };
var configurationRepository = new Mock<IConfigurationRepository>();
configurationRepository.Setup(x => x.GetConfigurationsByVendrorAndCountryAsync(configuration.VendorId, configuration.CountryId))
                      .ReturnsAsync(new[] { configuration });
var handler = new ConfigurationListQueryHandler(_mapper, configurationRepository.Object);

// Act
var result = await handler.GetConfigurationsByVendrorAndCountryAsync(configuration.VendorId, configuration.CountryId);

// Assert
configurationRepository.Verify(x => x.GetConfigurationsByVendrorAndCountryAsync(configuration.VendorId, configuration.CountryId), Times.Once);
Assert.NotNull(result);
Assert.Single(result);
Assert.Equal(configuration.VendorId, result[0].VendorId);
Assert.Equal(configuration.CountryId, result[0].CountryId);
