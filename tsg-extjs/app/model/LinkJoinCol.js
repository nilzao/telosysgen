Ext.define('TelosysGen.model.LinkJoinCol', {
	extend : 'Ext.data.Model',
	alias : 'model.linkJoinCol',
	fields : [ {
		name : 'id',
		type : 'int'
	}, {
		name : 'insertable',
		type : 'string'
	}, {
		name : 'name',
		type : 'string'
	}, {
		name : 'nullable',
		type : 'string'
	}, {
		name : 'referencedColumnName',
		type : 'string'
	}, {
		name : 'unique',
		type : 'string'
	}, {
		name : 'updatable',
		type : 'string'
	} ]
});
