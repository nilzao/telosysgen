Ext.define('TelosysGen.model.Column', {
	extend : 'Ext.data.Model',
	alias : 'model.column',
	fields : [ {
		name : 'id',
		type : 'int'
	}, {
		name : 'dbName',
		type : 'string'
	}, {
		name : 'dbComment',
		type : 'string'
	}, {
		name : 'dbDefaultValue',
		type : 'string'
	}, {
		name : 'dbNotNull',
		type : 'string'
	}, {
		name : 'dbPosition',
		type : 'string'
	}, {
		name : 'dbPrimaryKey',
		type : 'string'
	}, {
		name : 'dbSize',
		type : 'string'
	}, {
		name : 'dbTypeName',
		type : 'string'
	}, {
		name : 'inputType',
		type : 'string'
	}, {
		name : 'javaName',
		type : 'string'
	}, {
		name : 'javaType',
		type : 'string'
	}, {
		name : 'jdbcTypeCode',
		type : 'string'
	}, {
		name : 'label',
		type : 'string'
	}, {
		name : 'notNull',
		type : 'string'
	} ]
});
