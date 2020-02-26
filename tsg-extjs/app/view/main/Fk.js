Ext.define('TelosysGen.view.main.Fk', {
	extend : 'Ext.grid.Panel',
	xtype : 'fklist',
	requires : [ 'TelosysGen.store.Fk', 'TelosysGen.view.grid.tbar.GridTbar' ],
	minHeight : 200,
	title : 'Fks',
	autoLoad : true,
	store : {
		type : 'fk'
	},
	tbar : {
		items : [ {
			xtype : 'gridtbar'
		}, {
			xtype : 'tbar.table.combo'
		} ]
	},
	columns : [ {
		text : 'Id',
		dataIndex : 'id'
	}, {
		text : 'Name',
		dataIndex : 'name',
		flex : 1,
		editor : 'textfield'
	}, {
		text : 'Fk Column',
		dataIndex : 'fkcol',
		flex : 1,
		editor : 'textfield'
	} ],
	plugins : {
		ptype : 'rowediting',
		clicksToEdit : 2
	}
});
