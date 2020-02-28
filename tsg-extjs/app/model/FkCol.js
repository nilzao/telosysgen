Ext.define('TelosysGen.model.FkCol', {
	extend : 'Ext.data.Model',
	alias : 'model.fkCol',
	fields : [ {
		name : 'id',
		type : 'int'
	}, {
		name : 'colname',
		type : 'string'
	}, {
		name : 'colref',
		type : 'string'
	}, {
		name : 'deferrable',
		type : 'string'
	}, {
		name : 'deleterule',
		type : 'string'
	}, {
		name : 'sequence',
		type : 'string'
	}, {
		name : 'tablename',
		type : 'string'
	}, {
		name : 'tableref',
		type : 'string'
	}, {
		name : 'updaterule',
		type : 'string'
	}, {
		name : 'value',
		type : 'string'
	} ],
	proxy : {
		type : 'rest',
		url : TelosysGen.Vars.baseStoreProxyUrl + '/fkcol',
		api : {
			create : TelosysGen.Vars.baseStoreProxyUrl + '/fkcol',
			update : TelosysGen.Vars.baseStoreProxyUrl + '/fkcol',
			destroy : TelosysGen.Vars.baseStoreProxyUrl + '/fkcol'
		},
		baseUrl : '/fkcol',
		reader : {
			type : 'json',
			rootProperty : '_embedded.fkcol',
			totalProperty : 'page.totalElements'
		},
		writer : {
			type : 'json',
			writeAllFields : true
		}
	}
});
