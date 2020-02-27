Ext.define('TelosysGen.view.grid.tbar.FkCombo', {
	extend : 'Ext.form.field.ComboBox',
	xtype : 'tbar.fk.combo',
	fieldLabel : 'Table Filter',
	queryMode : 'remote',
	displayField : 'name',
	valueField : 'id',
	queryParam : 'name',
	store : {
		type : 'table'
	},
	//http://localhost:8080/fkcol/search/findByFk_Table_IdTable?tableId=523
	//http://localhost:8080/fkcol/search/findByLink_Table_IdTable?tableId=523
	listeners : {
		select : function(combo, record, eOpts) {
			var gridStore = combo.findParentByType("grid").getStore();
			console.log(combo.findParentByType("grid"));
			gridStore.getProxy().setUrl(TelosysGen.Vars.baseStoreProxyUrl + '' + gridStore.getProxy().baseUrl + '/search/findByFk_Table_IdTable');
			gridStore.getProxy().setExtraParams({
				tableId : record.getData().id
			});
			gridStore.load();
		},
		beforequery : function(queryPlan, eOpts) {
			if (queryPlan.query == "") {
				queryPlan.combo.getStore().getProxy().setUrl(TelosysGen.Vars.baseStoreProxyUrl + '/table');
			} else {
				queryPlan.combo.getStore().getProxy().setUrl(TelosysGen.Vars.baseStoreProxyUrl + '/table/search/findByName');
			}
		}
	}
});
