# Trabajo Práctico 6 Ej2 📚
- Institución: Universidad de La Punta (ULP)
- Materia: Laboratorio de Programación I
- Año: 2025
- Integrantes (comisión 1, grupo 11):
  
  - Mauricio Reta
  - Juan Cruz Rodriguez
  - Agustín Mazza
  - Jeremías Hoyo
  - Facundo Lopez Cozzella
  - Jeremías Sirur Flores

## Ejercicio 2
<p>El supermercado “DeTodo S.A.” nos ha pedido crear una demo del módulo productos que permita: dar de alta/baja y modificar productos del establecimiento y una serie de consultas de dichos productos por: rubro, nombre y precios. De cada Producto, interesa conocer: código (numérico), descripción, precio, stock y rubro (comestible, limpieza y perfumería son los únicos permitidos). Para dar solución a este requerimiento, lo haremos implementando un <b>TreeSet</b> de Productos, en donde haremos que se ordenen por código a medida que se van ingresando.</p>

<p>Es importante que repartan las tareas entre los miembros del equipo de forma que: uno crea repositorio en <b>GitHub</b>; los demás clonan, luego, cada uno hace una de las clases que forman parte del proyecto y suben al repositorio los cambios.</p>

<p>Utilice <b>JFrame, JDesktopPane, JInternalFrame, JMenu, JMenuBar, JMenuItem, JTable, JComboBox, JSpinner y JPanel</b>. Validar: campos con datos o vacíos dentro de un mismo panel y los NumberFormatExeption al cargar. Recuerde el uso de eventos como: FocusLost; y use requestFocus para mostrar un diálogo de ingreso incorrecto y pedir reingreso.</p>

<p>Armar una barra de menú que contenga dos JMenu, uno para Administración y otro para Consultas. Del primero se invoca la vista para gestionar los productos, del segundo se extienden
opciones para consultar por Nombre, por Precio, y por Rubro.</p>

<p>A continuación mostramos las vistas sugeridas para el menú general, la gestión de productos y para las consultas solicitadas.</p>
<img width="1066" height="767" alt="imgParaElREADME13" src="https://github.com/user-attachments/assets/af23d854-e089-4aea-a043-302097ef0990" />

<p>Note que el botón de Guardar se habilita (setEnabled) según se lo permita con el evento MouseClicked en la tabla, por ejemplo, luego de oprimir "Nuevo", "Actualizar", "Buscar", o "Eliminar".
Controle el formato de ingreso de números o letras. Use los ShowMessageDialog para comunicar lo validado.</p>
<img width="307" height="151" alt="imgParaElREADME14" src="https://github.com/user-attachments/assets/c464ac46-7a67-48f6-9c4c-b715249de9de" />
<HR>
<img width="857" height="747" alt="imgParaElREADME15" src="https://github.com/user-attachments/assets/b1a9a6d2-d255-4504-b537-2fdefe063278" />

<p>Las celdas de cualquier tabla no deben ser editables. No debe haber botones. <BR>
Sugerencia: valerse de los eventos keyReleased, keyPressed, MouseClicked o keyTiped para blanquear la tabla, borrar y redibujarla ante el evento de una tecla o mouse presionado. Puede usar ItemStateChanged en caso de los JComboBox.</p>
