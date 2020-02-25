Ext.define('TelosysGen.view.main.Column.js', {
	extend : 'Ext.grid.Panel',
	xtype : 'columnlist',
	requires : [ 'TelosysGen.store.Column' ],

	title : 'Column',
	autoLoad : true,
	store : {
		type : 'column'
	},
	tbar : {
		xtype : 'gridtbar'
	},
	columns : [ {
		text : 'Id',
		dataIndex : 'id'
	}, {
		text : 'Name',
		dataIndex : 'dbName',
		editor : 'textfield'
	}, {
		text : 'dbComment',
		dataIndex : 'dbComment',
		flex : 1,
		editor : 'textfield'
	}, {
		text : 'dbDefaultValue',
		dataIndex : 'dbDefaultValue',
		editor : 'textfield'
	}, {
		text : 'dbNotNull',
		dataIndex : 'dbNotNull',
		editor : 'textfield'
	}, {
		text : 'dbPosition',
		dataIndex : 'dbPosition',
		editor : 'textfield'
	}, {
		text : 'dbPrimaryKey',
		dataIndex : 'dbPrimaryKey',
		editor : 'textfield'
	}, {
		text : 'dbSize',
		dataIndex : 'dbSize',
		editor : 'textfield'
	}, {
		text : 'dbTypeName',
		dataIndex : 'dbTypeName',
		editor : 'textfield'
	}, {
		text : 'inputType',
		dataIndex : 'inputType',
		editor : 'textfield'
	}, {
		text : 'javaName',
		dataIndex : 'javaName',
		editor : 'textfield'
	}, {
		text : 'javaType',
		dataIndex : 'javaType',
		editor : 'textfield'
	}, {
		text : 'jdbcTypeCode',
		dataIndex : 'jdbcTypeCode',
		editor : 'textfield'
	}, {
		text : 'label',
		dataIndex : 'label',
		editor : 'textfield'
	}, {
		text : 'notNull',
		dataIndex : 'notNull',
		editor : 'textfield'
	} ],
	plugins : {
		ptype : 'rowediting',
		clicksToEdit : 2
	}
});
