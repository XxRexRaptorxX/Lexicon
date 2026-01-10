---
navigation:
  title: "Smelting"
  icon: "minecraft:furnace"
  position: 5
  parent: lexicon:mining.md
---

# Smelting

There are multiple fuels that can be used to smelt items. 
The type of fuel that should be used depends on the number of items in question. 

__Different types of smelter:__ 
- [__<ItemLink id="minecraft:furnace" />__](../useables/furnace.md) smelts all possible items 
- [__<ItemLink id="minecraft:blast_furnace" />__](../useables/blast_furnace.md) smelts only ores, but twice as fast 
- [__<ItemLink id="minecraft:smoker" />__](../useables/smoker.md) smelts only food, but twice as fast

----

![](fuel_chart_1.png) ![](fuel_chart_2.png)

**Smelt/Fuel Item** = How many items are smelted with 1 fuel

**Fuel for 1 Stack items** = How many fuel is needed for 64 items (1 Stack)

-----

## Auto-Smelter

<a name="smelter"></a>

<Row>
    <GameScene zoom={2} interactive={true}>
        <Block x="1" y="3" z="1" id="minecraft:chest" p:facing="north" />
    
        <Block x="1" y="2" z="1" id="minecraft:hopper" />
        <Block x="1" y="2" z="2" id="minecraft:chest" p:facing="west" />
        
        <Block x="1" y="1" z="1" id="minecraft:furnace" p:facing="north" />
        <Block x="1" y="1" z="2" id="minecraft:hopper" p:facing="north" />
        
        <Block x="1" y="0" z="0" id="minecraft:chest" p:facing="north" />
        <Block x="1" y="0" z="1" id="minecraft:hopper" p:facing="north" />
    </GameScene>

    ![](auto_smelter_1.png)
</Row>

-----

## Super Smelter

The best way to smelt a lot of ores after a mining session.

<Row> 
    <GameScene zoom={1.5} interactive={true}>
        <Block x="0" y="4" z="1" id="minecraft:chest" p:facing="south" p:type="right" />
        <Block x="1" y="4" z="1" id="minecraft:chest" p:facing="south" p:type="left" />
    
        <Block x="0" y="3" z="0" id="minecraft:chest" p:facing="south" p:type="right" />
        <Block x="1" y="3" z="0" id="minecraft:chest" p:facing="south" p:type="left" />
        <Block x="2" y="3" z="0" id="minecraft:redstone_block" />
        <Block x="9" y="3" z="0" id="minecraft:redstone_block" />
        <Entity x="5" y="3" z="0" id="minecraft:hopper_minecart" />
        
        <Block x="0" y="3" z="1" id="minecraft:cobblestone" />
        <Block x="1" y="3" z="1" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
        <Block x="2" y="3" z="1" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
        <Block x="3" y="3" z="1" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
        <Block x="4" y="3" z="1" id="minecraft:rail" p:shape="east_west" />
        <Block x="5" y="3" z="1" id="minecraft:rail" p:shape="east_west" />
        <Block x="6" y="3" z="1" id="minecraft:rail" p:shape="east_west" />
        <Block x="7" y="3" z="1" id="minecraft:rail" p:shape="east_west" />
        <Block x="8" y="3" z="1" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
        <Block x="9" y="3" z="1" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
        <Block x="10" y="3" z="1" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
        <Block x="11" y="3" z="1" id="minecraft:cobblestone" />
        <Entity x="6" y="4" z="1" id="minecraft:hopper_minecart" />
    
        <Block x="0" y="2" z="0" id="minecraft:cobblestone" />
        <Block x="1" y="2" z="0" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
        <Block x="2" y="2" z="0" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
        <Block x="3" y="2" z="0" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
        <Block x="4" y="2" z="0" id="minecraft:rail" p:shape="east_west" />
        <Block x="5" y="2" z="0" id="minecraft:rail" p:shape="east_west" />
        <Block x="6" y="2" z="0" id="minecraft:rail" p:shape="east_west" />
        <Block x="7" y="2" z="0" id="minecraft:rail" p:shape="east_west" />
        <Block x="8" y="2" z="0" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
        <Block x="9" y="2" z="0" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
        <Block x="10" y="2" z="0" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
        <Block x="11" y="2" z="0" id="minecraft:cobblestone" />
        
        <Block x="1" y="2" z="1" id="minecraft:hopper" />
        <Block x="2" y="2" z="1" id="minecraft:hopper" />
        <Block x="3" y="2" z="1" id="minecraft:hopper" />
        <Block x="4" y="2" z="1" id="minecraft:hopper" />
        <Block x="5" y="2" z="1" id="minecraft:hopper" />
        <Block x="6" y="2" z="1" id="minecraft:hopper" />
        <Block x="7" y="2" z="1" id="minecraft:hopper" />
        <Block x="8" y="2" z="1" id="minecraft:hopper" />
        <Block x="9" y="2" z="1" id="minecraft:hopper" />
        <Block x="10" y="2" z="1" id="minecraft:hopper" />
    
        <Block x="1" y="1" z="0" id="minecraft:hopper" p:facing="south" />
        <Block x="2" y="1" z="0" id="minecraft:hopper" p:facing="south" />
        <Block x="3" y="1" z="0" id="minecraft:hopper" p:facing="south" />
        <Block x="4" y="1" z="0" id="minecraft:hopper" p:facing="south" />
        <Block x="5" y="1" z="0" id="minecraft:hopper" p:facing="south" />
        <Block x="6" y="1" z="0" id="minecraft:hopper" p:facing="south" />
        <Block x="7" y="1" z="0" id="minecraft:hopper" p:facing="south" />
        <Block x="8" y="1" z="0" id="minecraft:hopper" p:facing="south" />
        <Block x="9" y="1" z="0" id="minecraft:hopper" p:facing="south" />
        <Block x="10" y="1" z="0" id="minecraft:hopper" p:facing="south" />
        
        <Block x="1" y="1" z="1" id="minecraft:blast_furnace" p:facing="south" />
        <Block x="2" y="1" z="1" id="minecraft:blast_furnace" p:facing="south" />
        <Block x="3" y="1" z="1" id="minecraft:blast_furnace" p:facing="south" />
        <Block x="4" y="1" z="1" id="minecraft:blast_furnace" p:facing="south" />
        <Block x="5" y="1" z="1" id="minecraft:blast_furnace" p:facing="south" />
        <Block x="6" y="1" z="1" id="minecraft:blast_furnace" p:facing="south" />
        <Block x="7" y="1" z="1" id="minecraft:blast_furnace" p:facing="south" />
        <Block x="8" y="1" z="1" id="minecraft:blast_furnace" p:facing="south" />
        <Block x="9" y="1" z="1" id="minecraft:blast_furnace" p:facing="south" />
        <Block x="10" y="1" z="1" id="minecraft:blast_furnace" p:facing="south" />
      
        <Block x="1" y="0" z="1" id="minecraft:hopper" p:facing="south" />
        <Block x="2" y="0" z="1" id="minecraft:hopper" p:facing="west" />
        <Block x="3" y="0" z="1" id="minecraft:hopper" p:facing="west" />
        <Block x="4" y="0" z="1" id="minecraft:hopper" p:facing="west" />
        <Block x="5" y="0" z="1" id="minecraft:hopper" p:facing="west" />
        <Block x="6" y="0" z="1" id="minecraft:hopper" p:facing="west" />
        <Block x="7" y="0" z="1" id="minecraft:hopper" p:facing="west" />
        <Block x="8" y="0" z="1" id="minecraft:hopper" p:facing="west" />
        <Block x="9" y="0" z="1" id="minecraft:hopper" p:facing="west" />
        <Block x="10" y="0" z="1" id="minecraft:hopper" p:facing="west" />
        
        <Block x="0" y="0" z="2" id="minecraft:chest" p:facing="south" p:type="right" />
        <Block x="1" y="0" z="2" id="minecraft:chest" p:facing="south" p:type="left" />
    </GameScene>
    
    ![](super_smelter_1.png) ![](super_smelter_2.png)

</Row>