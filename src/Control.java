public class Control {
    
    Departamento departamentoVentas;
    Departamento departamentoFiscal;
    Departamento_Jefe departamentoJefe;

    public Control(){
        departamentoVentas = new Departamento_De_Ventas("depar Fontibon");
        departamentoFiscal = new Departamento_Fiscal("depar Kennedy");
        departamentoJefe = new Departamento_Jefe("depar Usme");
        departamentoJefe.anadirDepartamentos(departamentoFiscal);
        departamentoJefe.anadirDepartamentos(departamentoVentas);
        imprimirLista();
    }

    public void imprimirLista(){
        for(int i = 0; i < departamentoJefe.getDependencias().size(); i++){
            System.out.println(departamentoJefe.getDependencias().get(i));
        }
    }
}
