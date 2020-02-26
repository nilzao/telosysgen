Ext.define('TelosysGen.view.main.Link', {
	extend : 'Ext.grid.Panel',
	xtype : 'linklist',
	requires : [ 'TelosysGen.store.Link', 'TelosysGen.view.grid.tbar.GridTbar' ],
	minHeight : 200,
	title : 'Links',
	autoLoad : true,
	store : {
		type : 'link'
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
		dataIndex : 'idDb',
		editor : 'textfield'
	}, {
		text : 'cardinalityTg',
		dataIndex : 'cardinalityTg',
		editor : 'textfield'
	}, {
		text : 'foreignKeyName',
		dataIndex : 'foreignKeyName',
		editor : 'textfield'
	}, {
		text : 'inverseSideOf',
		dataIndex : 'inverseSideOf',
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
		text : 'joinTableName',
		dataIndex : 'joinTableName',
		editor : 'textfield'
	}, {
		text : 'mappedBy',
		dataIndex : 'mappedBy',
		editor : 'textfield'
	}, {
		text : 'optional',
		dataIndex : 'optional',
		editor : 'textfield'
	}, {
		text : 'owningSide',
		dataIndex : 'owningSide',
		editor : 'textfield'
	}, {
		text : 'sourceTableName',
		dataIndex : 'sourceTableName',
		editor : 'textfield'
	}, {
		text : 'targetEntity',
		dataIndex : 'targetEntity',
		editor : 'textfield'
	}, {
		text : 'targetTableName',
		dataIndex : 'targetTableName',
		editor : 'textfield'
	}, {
		text : 'used',
		dataIndex : 'used',
		editor : 'textfield'
	}, {
		text : 'cascade',
		dataIndex : 'cascade',
		editor : 'textfield'
	}, {
		text : 'fetch',
		dataIndex : 'fetch',
		editor : 'textfield'
	} ],
	plugins : {
		ptype : 'rowediting',
		clicksToEdit : 2
	}
});
