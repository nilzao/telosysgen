Ext.define('TelosysGen.view.main.Database', {
	extend : 'Ext.grid.Panel',
	requires : [ 'Ext.form.field.Date' ],
	xtype : 'databaselist',
	requires : [ 'TelosysGen.store.Database', 'TelosysGen.view.grid.tbar.GridTbar' ],
	minHeight : 400,
	title : 'Databases',
	autoLoad : true,
	store : {
		type : 'database'
	},
	tbar : {
		xtype : 'gridtbar'
	},
	columns : [ {
		text : 'Id',
		dataIndex : 'id'
	}, {
		text : 'Name',
		dataIndex : 'databaseName',
		editor : 'textfield',
		flex : 1
	}, {
		text : 'Product Name',
		dataIndex : 'databaseProductName',
		editor : 'textfield',
		flex : 1
	}, {
		text : 'Generation',
		dataIndex : 'generation',
		xtype : 'datecolumn'
	} ],
	plugins : {
		ptype : 'rowediting',
		clicksToEdit : 2
	},
	bbar : {
		xtype : 'pagingtoolbar',
		displayInfo : true
	}
});
