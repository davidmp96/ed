using System;
using Gtk;

public partial class MainWindow: Gtk.Window {	

	public MainWindow (): base (Gtk.WindowType.Toplevel) {
		Build ();
		labelResumen.Text = "Hola. Rellena todos los campos y dale al botón!!";
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a) {
		Application.Quit ();
		a.RetVal = true;
	}

	protected void OnButtonClicked (object sender, EventArgs e) {
		labelResumen.Text = "Hola " + entryNombre.Text + "" 
			+ entryApellidos.Text + " ,estas cursando " 
				+ entryCurso.Text + " y tu nota final en " + entryModulo.Text + " es: " + entryNota.Text + " ENHORABUENA!!!!";
	}
}
