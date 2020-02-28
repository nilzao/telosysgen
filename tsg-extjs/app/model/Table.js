Ext.define('TelosysGen.model.Table', {
	extend : 'Ext.data.Model',
	alias : 'model.table',
	fields : [ {
		name : 'id',
		type : 'int'
	}, {
		name : 'name',
		type : 'string'
	}, {
		name : 'javaBean',
		type : 'string'
	}, {
		name : 'schema',
		type : 'string'
	}, {
		name : 'catalog',
		type : 'string'
	}, {
		name : 'databaseComment',
		type : 'string'
	}, {
		name : 'databaseType',
		type : 'string'
	} ],
	proxy : {
		type : 'rest',
		url : TelosysGen.Vars.baseStoreProxyUrl + '/table',
		api : {
			create : TelosysGen.Vars.baseStoreProxyUrl + '/table',
			update : TelosysGen.Vars.baseStoreProxyUrl + '/table',
			destroy : TelosysGen.Vars.baseStoreProxyUrl + '/table'
		},
		baseUrl : '/table',
		reader : {
			type : 'json',
			rootProperty : '_embedded.table',
			totalProperty : 'page.totalElements'
		},
		writer : {
			type : 'json',
			writeAllFields : true
		}
	}
});
