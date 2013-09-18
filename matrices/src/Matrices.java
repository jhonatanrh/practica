
import javax.swing.JOptionPane;



public class Matrices {

    
    int m[][];
    
    Matrices(){
    m=new int[3][3];
    
   } 
  void cargar(){
      for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
              m[i][j]=Integer.parseInt(JOptionPane.showInputDialog("m["+i+"]["+j+"]:"));
              
          }
      }
   }

   void mul(Matrices ob1,Matrices ob2){
      for(int i=0;i<3;i++)
          for(int j=0;j<3;j++)
              for(int k=0;k<3;k++)
              m[i][j]+=ob1.m[i][k]*ob2.m[k][j];
      }
      
    void imprimir(){
       String S="los datos son:\n";
       for(int i=0;i<3;i++){
          for(int j=0;j<3;j++)
              S+="\n";  
    }
  }  
    
  JOptionPane.showMessageDialog(null, S);
  
}
