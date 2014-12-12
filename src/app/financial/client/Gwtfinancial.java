package app.financial.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Gwtfinancial implements EntryPoint {

	private FlexTable billsFlexTable = new FlexTable();

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		billsFlexTable.setText(0, 0, "Comida");

		RootPanel.get("bills").add(billsFlexTable);
		RootPanel.get("bills").add(new Button("Teste"));
	}
}
