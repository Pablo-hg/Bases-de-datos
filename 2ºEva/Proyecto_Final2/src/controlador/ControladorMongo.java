package controlador;
import com.mongodb.client.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;
import org.bson.Document;


public class ControladorMongo {
    
    static MongoClient cliente = MongoClients.create();;
    static MongoDatabase database = cliente.getDatabase("basededatos");
    static MongoCollection colecionempl = database.getCollection("Empleado");
    static MongoCollection colecionord = database.getCollection("Ordenador");
    static MongoCollection colecionper = database.getCollection("Perifericos");
    static MongoCursor cursor = colecionempl.find().iterator();
    static MongoCursor cursor2 = colecionord.find().iterator(); 
    static MongoCursor cursor3 = colecionper.find().iterator(); 

    
    //Añadir un empleado
    public static void AñadirEmpleado(){
        Document empleado = new Document("Nombre",vista.CrearEmpleado.jTextFieldnombre.getText())
                .append("Apellidos", vista.CrearEmpleado.jTextFieldapellidos.getText())
                .append("Departamento", vista.CrearEmpleado.jTextFielddepartamento.getText())
                .append("Sitio", Integer.parseInt(vista.CrearEmpleado.jTextFieldasiento.getText()));
        colecionempl.insertOne(empleado);
        vista.CrearEmpleado.jLabelerror.setText("Empleado añadido");
    }
    
    //Añadir un Ordenador
    public static void Añadirordenador(){
        Document ordenador = new Document("Placa",vista.CrearOrdenador.jTextFieldplaca.getText())
                .append("Procesador", vista.CrearOrdenador.jTextFieldprocesador.getText())
                .append("Tarjeta_grafica", vista.CrearOrdenador.jTextFieldtarjeta.getText())
                .append("Memoria_ram", vista.CrearOrdenador.jTextFieldram.getText())
                .append("Alimentacion", vista.CrearOrdenador.jTextFieldventilacion.getText())
                .append("Disco_duro", vista.CrearOrdenador.jTextFielddiscoduro.getText())
                .append("Disco_ssd", vista.CrearOrdenador.jTextFielddiscossd.getText())
                .append("Ventilacion", vista.CrearOrdenador.jTextFieldventilacion.getText())
                .append("Caja", vista.CrearOrdenador.jTextFieldtorre.getText())
                .append("Asiento", Integer.parseInt(vista.CrearOrdenador.jTextFieldasiento.getText()));
        colecionord.insertOne(ordenador);
        vista.CrearOrdenador.jLabelerror.setText("Ordenador insertado");
    }
    
    
    //Añadir un Periferico
    public static void AñadirPeriferico(){
        Document perifericos = new Document("Monitor1",vista.CrearPeriferico.jTextFieldmonitor1.getText())
                .append("Monitor2", vista.CrearPeriferico.jTextFielmonitor2.getText())
                .append("Raton", vista.CrearPeriferico.jTextFieldraton.getText())
                .append("Teclado", vista.CrearPeriferico.jTextFieldteclado.getText())
                .append("Disco portatil", vista.CrearPeriferico.jTextFielddisco1.getText())
                .append("Asiento", Integer.parseInt(vista.CrearPeriferico.jTextFieldasiento.getText()));
        colecionper.insertOne(perifericos);
        vista.CrearPeriferico.jLabelerror.setText("Perifericos insertados");
    }
    
    
    //Ver todos los empleados
    public static void VertodosEmpleados(){
        String datos = "";
        vista.VerEmpleado.jTextAreaInfoEmpleados.setText("");
        while(cursor.hasNext()){
            Document empleado =(Document) cursor.next();
            datos += "Nombre: " + empleado.get("Nombre");
            datos += ";   Apellidos: " + empleado.get("Apellidos");
            datos += ";   Departamento: " + empleado.get("Departamento");
            datos += ";   Asiento: " + empleado.get("Sitio");
            datos += '\n';
        }
        cursor.close();
        vista.VerEmpleado.jTextAreaInfoEmpleados.setText(vista.VerEmpleado.jTextAreaInfoEmpleados.getText() + datos);
    }
    
    //ver todos los ordenadores
    public static void VertodosOrdenador(){
        try{
            String datos = "";
            vista.VerOrdenador.jTextAreaInfoOrdenadores.setText("");
            while(cursor2.hasNext()){
                Document ordenador =(Document) cursor2.next();
                datos += "Placa: " + ordenador.get("Placa");
                datos += ";   Procesador: " + ordenador.get("Procesador");
                datos += ";   Tarjeta_grafica: " + ordenador.get("Tarjeta_grafica");
                datos += ";   Memoria_ram: " + ordenador.get("Memoria_ram");
                datos += ";   Alimentacion: " + ordenador.get("Alimentacion");
                datos += ";   Disco_duro: " + ordenador.get("Disco_duro");
                datos += ";   Disco_ssd: " + ordenador.get("Disco_ssd");
                datos += ";   Ventilacion: " + ordenador.get("Ventilacion");
                datos += ";   Caja: " + ordenador.get("Caja");
                datos += ";   Asiento: " + ordenador.get("Asiento");
                datos += '\n';
            }
            vista.VerOrdenador.jTextAreaInfoOrdenadores.setText(datos);
        }finally{
            cursor2.close();
        }     
    }
    
    
    //Ver todos los perifericos
    public static void VertodosPerifericos(){
        try{
            String datos = "";
            vista.VerPerifericos.jTextAreaInfoperifericos.setText("");
            while(cursor3.hasNext()){
                Document perifericos =(Document) cursor3.next();
                datos += "Monitor1: " + perifericos.get("Monitor1");
                datos += ";   Monitor2: " + perifericos.get("Monitor2");
                datos += ";   Raton: " + perifericos.get("Raton");
                datos += ";   Teclado: " + perifericos.get("Teclado");
                datos += ";   Disco portatil: " + perifericos.get("Disco portatil");
                datos += ";   Asiento: " + perifericos.get("Asiento");
                datos += '\n';
            }
            vista.VerPerifericos.jTextAreaInfoperifericos.setText(datos);
        }finally{
            cursor3.close();
        } 
    }
    
    
    
    //Ver un empleado
    public static void VerEmpleado(){
        boolean ver = false;
        String dato = "";
        int asiento = Integer.parseInt(vista.VerEmpleado.jTextFieldasiento.getText());
        vista.VerEmpleado.jTextAreaInfoEmpleados.setText("");
            while(cursor.hasNext()){
                Document empleado =(Document) cursor.next();
                if(empleado.get("Sitio").equals(asiento)){
                    dato += "Nombre: " + empleado.get("Nombre");
                    dato += ";   Apellidos: " + empleado.get("Apellidos");
                    dato += ";   Departamento: " + empleado.get("Departamento");
                    dato += ";   Asiento: " + empleado.get("Sitio");
                    ver = true; 
                    vista.VerEmpleado.jTextAreaInfoEmpleados.setText(dato);
                }
            }
            cursor.close();
            if(!ver){
                vista.VerEmpleado.jTextAreaInfoEmpleados.setText("Noy nadie sentado en el asiento " + asiento); 
            }
    }
    
    //Ver un ordenador
    public static void VerOrdenador(){
        boolean ver = false;
        String dato = "";
        int asiento = Integer.parseInt(vista.VerOrdenador.jTextFieldasiento.getText());
        vista.VerOrdenador.jTextAreaInfoOrdenadores.setText("");
        while(cursor2.hasNext()){
            Document ordenador =(Document) cursor2.next();
            if(ordenador.get("Asiento").equals(asiento)){
                dato += "Placa: " + ordenador.get("Placa");
                dato += ";   Procesador: " + ordenador.get(" Procesador");
                dato += ";   Tarjeta_grafica: " + ordenador.get("Tarjeta_grafica");
                dato += ";   Memoria_ram: " + ordenador.get("Memoria_ram");
                dato += ";   Alimentacion: " + ordenador.get("Alimentacion");
                dato += ";   Disco_duro: " + ordenador.get("Disco_duro");
                dato += ";   Disco_ssd: " + ordenador.get("Disco_ssd");
                dato += ";   Ventilacion: " + ordenador.get("Ventilacion");
                dato += ";   Caja: " + ordenador.get("Caja");
                dato += ";   Asiento: " + ordenador.get("Asiento");
                vista.VerOrdenador.jTextAreaInfoOrdenadores.setText(dato);
                ver = true;
            }
        }
        cursor2.close();
        if(!ver){
            vista.VerOrdenador.jTextAreaInfoOrdenadores.setText("Noy nadie sentado en el asiento " + asiento); 
        }
    }
    
    //Ver un periferico
    public static void VerPeriferico(){
        boolean ver = false;
        String dato = "";
        int asiento = Integer.parseInt(vista.VerPerifericos.jTextFieldasiento.getText());
        vista.VerPerifericos.jTextAreaInfoperifericos.setText("");
        while(cursor3.hasNext()){
            Document perifericos = (Document) cursor3.next();
            if (perifericos.get("Asiento").equals(asiento)){
                dato += "Monitor1: " + perifericos.get("Monitor1");
                dato += ";   Monitor2: " + perifericos.get("Monitor2");
                dato += ";   Raton: " + perifericos.get("Raton");
                dato += ";   Teclado: " + perifericos.get("Teclado");
                dato += ";   Disco portatil: " + perifericos.get("Disco portatil");
                dato += ";   Asiento: " + perifericos.get("Asiento");
                vista.VerPerifericos.jTextAreaInfoperifericos.setText(dato);
                ver = true;
            }
        }
        cursor3.close();
        if (!ver){
            vista.VerPerifericos.jTextAreaInfoperifericos.setText("NO hay ningún periferico en el asiento " + asiento);
        }
    }
    
    //Eliminar un empleado
    public static void EliminarEmpleado(){
        boolean eliminar = false;
        int asiento = Integer.parseInt(vista.EliminarEmpleado.jTextFieldasiento.getText());
        while(cursor.hasNext()){
            Document empleado =(Document) cursor.next();
            if(empleado.get("Sitio").equals(asiento)){
                colecionempl.deleteOne(eq("Sitio",asiento));
                eliminar = true; 
                vista.EliminarEmpleado.jLabel3.setText("El empleado que se sentaba en el asiento " + asiento + " ha sido eliminado");
            }
        }
        cursor.close();
        if(!eliminar){
           vista.EliminarEmpleado.jLabel3.setText("Noy nadie sentado en el asiento " + asiento); 
        }
    }    
    
    //Eliminar Ordenador
    public static void EliminarOrdenador(){
        boolean eliminar = false;
        int asiento = Integer.parseInt(vista.EliminarOrdenador.jTextFieldasiento.getText());
        while(cursor2.hasNext()){
            Document ordenador =(Document) cursor2.next();
            if(ordenador.get("Asiento").equals(asiento)){
                colecionord.deleteOne(eq("Asiento",asiento));
                eliminar = true; 
                vista.EliminarOrdenador.jLabel3.setText("El ordenador que estaba en el asiento " + asiento + " ha sido eliminado");
            }
        }
        cursor2.close();
        if(!eliminar){
             vista.EliminarOrdenador.jLabel3.setText("Noy nadie sentado en el asiento " + asiento); 
        }
    }
    
    
    //Eliminar un periferico
    public static void EliminarPeriferico(){
        boolean eliminar = false;
        int asiento = Integer.parseInt(vista.EliminarPeriferico.jTextFieldasiento.getText());
        while(cursor3.hasNext()){
            Document perifericos =(Document) cursor3.next();
            if(perifericos.get("Asiento").equals(asiento)){
                if (vista.EliminarPeriferico.jCheckBoxm1.isSelected()){
                    perifericos.put("Monitor1", "");
                }
                if (vista.EliminarPeriferico.jCheckBoxm1.isSelected()){
                    perifericos.put("Monitor2", "");
                }
                if (vista.EliminarPeriferico.jCheckBoxm1.isSelected()){
                    perifericos.put("Raton", "");
                }
                if (vista.EliminarPeriferico.jCheckBoxm1.isSelected()){
                    perifericos.put("Teclado", "");
                }
                if (vista.EliminarPeriferico.jCheckBoxm1.isSelected()){
                    perifericos.put("Disco portatil", "");
                }
                else {
                    colecionper.deleteOne(eq("Asiento",asiento));
                    eliminar = true; 
                    vista.EliminarPeriferico.jLabel4.setText("Se han borrado los perifericos del asiento " + asiento);
                }
            }
            if(!eliminar) vista.EliminarPeriferico.jLabel4.setText("No hay nadie sentado en el asiento " + asiento);
        }
        cursor3.close();
    }
    
    
    //Modificar un empleado
    public static void ModificarEmpleado(){
        if (!vista.ModificarEmpleado.jTextFieldasiento.getText().equals("")){
            int asiento = Integer.parseInt(vista.ModificarEmpleado.jTextFieldasiento.getText());
            while(cursor.hasNext()){
            Document empleado =(Document) cursor.next();
                if(empleado.get("Sitio").equals(asiento)){
                    if(!vista.ModificarEmpleado.jTextFieldnewApellidos.getText().equals("")){
                        colecionempl.updateOne(eq("Sitio",asiento), set("Apellidos",vista.ModificarEmpleado.jTextFieldnewApellidos.getText()));
                    }
                    if (!vista.ModificarEmpleado.jTextFieldnewNombre.getText().equals("")){
                        colecionempl.updateOne(eq("Sitio",asiento), set("Nombre",vista.ModificarEmpleado.jTextFieldnewNombre.getText()));
                    }
                    if(!vista.ModificarEmpleado.jTextFieldnewdept.getText().equals("")){
                        colecionempl.updateOne(eq("Sitio",asiento), set("Departamento",vista.ModificarEmpleado.jTextFieldnewdept.getText()));
                    }
                }
            }
            cursor.close();
            vista.ModificarEmpleado.jLabel6.setText("El empleado que se sentaba en " + asiento + " ha sido modificado");
        }
        else vista.ModificarEmpleado.jLabel6.setText("Debes escribir el asiento para modificar");
    }
    
    //Modificar un ordenador
    public static void ModificarOrdenador(){
        if (!vista.ModificarOrdenador.jTextFieldasiento.getText().equals("")){
            int asiento = Integer.parseInt(vista.ModificarOrdenador.jTextFieldasiento.getText());
            String placa = vista.ModificarOrdenador.jTextFieldplaca.getText();
            while(cursor2.hasNext()){
                Document ordenador =(Document) cursor2.next();
                if(ordenador.get("Asiento").equals(asiento)){
                    if(!vista.ModificarOrdenador.jTextFieldplaca.getText().equals("")){
                        colecionempl.updateOne(eq("Asiento",asiento),combine( set("Placa",placa)));
                    }
                    if(!vista.ModificarOrdenador.jTextFieldtarjeta.getText().equals("")){
                        colecionempl.updateOne(eq("Asiento",asiento), set("Tarjeta_grafica",vista.ModificarOrdenador.jTextFieldtarjeta.getText()));
                    }
                    if(!vista.ModificarOrdenador.jTextFieldprocesador.getText().equals("")){
                        colecionempl.updateOne(eq("Asiento",asiento), set("Procesador",vista.ModificarOrdenador.jTextFieldprocesador.getText()));
                    }
                    if(!vista.ModificarOrdenador.jTextFieldventilacion.getText().equals("")){
                        colecionempl.updateOne(eq("Asiento",asiento), set("Ventilacion",vista.ModificarOrdenador.jTextFieldventilacion.getText()));
                    }
                    if(!vista.ModificarOrdenador.jTextFieldtorre.getText().equals("")){
                        colecionempl.updateOne(eq("Asiento",asiento), set("Caja",vista.ModificarOrdenador.jTextFieldtorre.getText()));
                    }
                    if(!vista.ModificarOrdenador.jTextFieldram.getText().equals("")){
                        colecionempl.updateOne(eq("Asiento",asiento), set("Memoria_ram",vista.ModificarOrdenador.jTextFieldram.getText()));
                    }
                    if(!vista.ModificarOrdenador.jTextFieldalimentacion.getText().equals("")){
                        colecionempl.updateOne(eq("Asiento",asiento), set("Alimentacion",vista.ModificarOrdenador.jTextFieldalimentacion.getText()));
                    }
                    if(!vista.ModificarOrdenador.jTextFielddisco.getText().equals("")){
                        colecionempl.updateOne(eq("Asiento",asiento), set("Disco_duro",vista.ModificarOrdenador.jTextFielddisco.getText()));
                    }
                    if(!vista.ModificarOrdenador.jTextFieldssd.getText().equals("")){
                        colecionempl.updateOne(eq("Asiento",asiento), set("Disco_ssd",vista.ModificarOrdenador.jTextFieldssd.getText()));
                    }
                    vista.ModificarOrdenador.jLabel12.setText("Empleado Modificado");
                }
            } 
            cursor2.close();
        }
        else vista.ModificarOrdenador.jLabel12.setText("Debes escribir el asiento para modificar");
    }
    
    
     //Modificar Periferico 
    public static void ModificarPeriferico(){
        int asiento = Integer.parseInt(vista.ModificarPerifericos.jTextFieldasiento.getText());
        while(cursor3.hasNext()){
            Document perifericos =(Document) cursor3.next();
            if(perifericos.get("Asiento").equals(asiento)){
                if (!vista.ModificarPerifericos.jTextFieldm1ç.getText().equals("")){
                    colecionper.updateOne(eq("Asiento",asiento), combine(set("Monitor1",vista.ModificarPerifericos.jTextFieldm1ç.getText())));
                }
                if(!vista.ModificarPerifericos.jTextFieldm2.getText().equals("")){
                    colecionper.updateOne(eq("Asiento",asiento), combine(set("Monitor2",vista.ModificarPerifericos.jTextFieldm2.getText())));
                }
                if (!vista.ModificarPerifericos.jTextFieldraton.getText().equals("")){
                    colecionper.updateOne(eq("Asiento",asiento), combine(set("Raton",vista.ModificarPerifericos.jTextFieldraton.getText())));
                }
                if(!vista.ModificarPerifericos.jTextFieldteclado.getText().equals("")){
                    colecionper.updateOne(eq("Asiento",asiento), combine(set("Teclado",vista.ModificarPerifericos.jTextFieldteclado.getText())));
                }
                if(!vista.ModificarPerifericos.jTextFielddusco.getText().equals("")){
                    colecionper.updateOne(eq("Asiento",asiento), combine(set("Disco portatil",vista.ModificarPerifericos.jTextFielddusco.getText())));
                }
                vista.ModificarPerifericos.jLabelerrror.setText("Perifericos modificados");
            }
        }
        cursor3.close();
        vista.ModificarPerifericos.jLabelerrror.setText("No hay perifericos en el asiento " + asiento);
    }
}
