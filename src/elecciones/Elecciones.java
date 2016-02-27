package elecciones;

public class Elecciones {
    
    public static int m=0;
    public static int n=0;
    
    public static String [][] mEle=new String[21][21];
    public static String [][] mCand=new String[21][21];
    public static String [][] mMuni=new String[21][21];   
    public static String [][] mVotos=new String[21][21];
    public static String [][] mAux=new String[21][21];
    
    public static void fSize(){
        do{java.util.Scanner lector= new java.util.Scanner(System.in);   
        System.out.println("Ingrese el numero de candidatos");
        Elecciones.m=lector.nextInt();
        if(m<1||m>20){
        System.out.println("Numero de candidatos no validos");            
        }
        }while(m<1|m>20);
        do{java.util.Scanner lectura= new java.util.Scanner(System.in);  
        System.out.println("Ingrese el numero de municipios");
        Elecciones.n=lectura.nextInt();
        if(n<1||n>20){
        System.out.println("Numero de municipios no validos");            
        }        
        }while(n<1|n>20);
    }

    public static void fOrdena(){
        System.out.println("5. Reporte ordenado de candidatos ");
    }
    
    public static void fResultado(){
        System.out.println("4. Informe de resultado de las elecciones: ");
    }
    
    public static void fVisualizar(){
        System.out.println("3. Informe de candidato con mayor numero de votos");
    }
    
    public static void fCalcularV(){
        System.out.println("2. Informe de votos recibidos por cada candidato: ");
        fContar();
    }
        
    public static void fRegistrar(){
        System.out.println("1. Reporte de votaciones: ");
        for(int i=0;i<21;i++){
            if(i<n+1){
            for(int j=0;j<21;j++){
                if(j<m+1){
            System.out.print(mEle[i][j]+"\t");
            }
        }                
        System.out.println("");
    }
}
}   

    public static void fContar(){
        int q=0;
        for(int i=0;i<21;i++){
            if(i<n+1){
            for(int j=0;j<21;j++){
                if(j<m+1){
                if(i==0||j==0){
                }else{
                    q=Integer.parseInt(mVotos[i][j])+q;
                }   
                }
    }
    }
    }
        System.out.println("Los votos totales fueron: "+q);
        int w=0;
        for(int i=0;i<21;i++){
            if(i<n+1){
            for(int j=0;j<21;j++){
                if(j<m+1){
                w = 0;
                if(i==0||j==0){
                }else{
                    w=Integer.parseInt(mVotos[i][j])+w;
                }
                }
    }}
     }        
    }
    
    public static void fAsigEle(){
        fAsigCand();
        fAsigMuni();
        fAsigVotos();
        for(int i=0;i<21;i++){
            if(i<n+1){
            for(int j=0;j<21;j++){
                if(j<m+1){
                    if(i==0&&j==0){
                        mEle[i][j]="";     
                    }else if(i==0)
                        {
                        mEle[i][j]=mCand[i][j];
                    }else if(j==0){
                        mEle[i][j]=mMuni[j][i];
                    }else{
                        mEle[i][j]=mVotos[j][i];
                    }
        }
        }
    }
    }
    }
    
    public static void fPruebaVotos(){
        for(int i=0;i<21;i++){
            if(i<m+1){
            for(int j=0;j<21;j++){
                if(j<n+1){           
                System.out.print(mVotos[i][j]+"\t");
            }
        }
        System.out.println("");               
    }    
    }
    }     
    
    public static void fAsigVotos(){
        for(int i=1;i<21;i++){
            if(i<m+1){
            for(int j=0;j<21;j++){
                if(j<n+1){
                    if(i==0||j==0){
                    mVotos[i][j]=null;    
                    }else{    
                    String k=null;
                    java.util.Scanner lector= new java.util.Scanner(System.in);
                    System.out.println("Ingrese los votos por el candidato numero " +(i)+ " en el municipio numero "+(j));
                    k=lector.next();                      
                    mVotos[i][j]=k;
        }
    }
    }
    }                  
    }
    }
        
    public static void fAsigMuni(){
        for(int i=0;i<21;i++){
            if(i<1){
            for(int j=0;j<21;j++){
                if(j<n+1){
                    if(i==0&&j==0){
                    mMuni[i][j]="";  
                    }else{
                    String k=null;
                    java.util.Scanner lector= new java.util.Scanner(System.in);
                    System.out.println("Ingrese el municipio numero "+(j));
                    k=lector.next();                      
                    mMuni[i][j]=k;
            }
        }
        }
    }
    }
        fPruebaMuni();
    }
    
    public static void fPruebaMuni(){
        for(int i=0;i<21;i++){
            if(i<1){
            for(int j=0;j<21;j++){
                if(j<n+1){
                System.out.print(mMuni[i][j]+"\t");
            }
        }                
    }
    }
        System.out.println("");      
    }     
    
    public static void fAsigCand(){
        for(int i=0;i<21;i++){
            if(i<1){
            for(int j=0;j<21;j++){
                if(j<m+1){
                    if(i==0&&j==0){
                    mCand[i][j]="";  
                    }else{
                    String k=null;
                    java.util.Scanner lector= new java.util.Scanner(System.in);
                    System.out.println("Ingrese el candidato numero "+(j));
                    k=lector.next();                      
                    mCand[i][j]=k;
            }
        }
        }
    }
    }            
        fPruebaCand();
    }
    
    public static void fPruebaCand(){
        for(int i=0;i<21;i++){
            if(i<1){
            for(int j=0;j<21;j++){
                if(j<m+1){
            System.out.print(mCand[i][j]+"\t");
            }
        }                
    }
    }
        System.out.println("");
    }  
    
    public static void fLibm(){
        fLibmEle();
        fLibmCand();
        fLibmMuni();
        fLibmVotos();
    }
    
   public static void fLibmVotos(){
        for(int i=0;i<21;i++){
            for(int j=0;j<21;j++){
                if(i==0&&j==0){
                mVotos[i][j]="";                    
                }else{                              
                mVotos[i][j]=null;
            }
        }
    }
    }
    
    public static void fLibmMuni(){
        for(int i=0;i<21;i++){
            for(int j=0;j<21;j++){
                if(i==0&&j==0){
                    mMuni[i][j]="";                    
                }else{
                    mMuni[i][j]=null;
            }
        }
    }
    }

    public static void fLibmCand(){
        for(int i=0;i<21;i++){
            for(int j=0;j<21;j++){
                if(i==0&&j==0){
                    mCand[i][j]="";                    
                }else{
                    mCand[i][j]=null;
            }
        }
    }
    }      
    
    public static void fLibmEle(){
        for(int i=0;i<21;i++){
            for(int j=0;j<21;j++){
                if(i==0&&j==0){
                    mEle[i][j]="";                    
                }else{
                    mEle[i][j]=null;
            }
        }
    }
    }   
    
    public static void main(String[] args) {
        fSize();        
        fLibm();
        fAsigEle();
        fRegistrar();
        fCalcularV();
        fVisualizar();
        fResultado();
        fOrdena();
    }
}
