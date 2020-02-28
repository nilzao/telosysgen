Ext.define('TelosysGen.view.main.FkCol', {
	extend : 'Ext.grid.Panel',
	xtype : 'fkcollist',
	requires : [ 'TelosysGen.store.FkCol', 'TelosysGen.view.grid.tbar.GridTbar', 'TelosysGen.store.FkCol', 'TelosysGen.view.grid.tbar.FkCombo' ],
	minHeight : 400,
	title : 'Fks Columns',
	autoLoad : true,
	store : {
		type : 'fkcol'
	},
	tbar : {
		items : [ {
			xtype : 'gridtbar'
		}, {
			xtype : 'tbar.fk.combo'
		} ]
	},
	columns : [ {
		text : 'Id',
		dataIndex : 'id'
	}, {
		text : 'tableref',
		dataIndex : 'tableref',
		editor : 'textfield',
		flex : 1
	}, {
		text : 'colname',
		dataIndex : 'colname',
		editor : 'textfield',
		flex : 1
	}, {
		text : 'colref',
		dataIndex : 'colref',
		editor : 'textfield',
		flex : 1
	}, {
		text : 'deferrable',
		dataIndex : 'deferrable',
		editor : 'textfield'
	}, {
		text : 'deleterule',
		dataIndex : 'deleterule',
		editor : 'textfield'
	}, {
		text : 'sequence',
		dataIndex : 'sequence',
		editor : 'textfield'
	}, {
		text : 'updaterule',
		dataIndex : 'updaterule',
		editor : 'textfield'
	}, {
		text : 'value',
		dataIndex : 'value',
		editor : 'textfield'
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
