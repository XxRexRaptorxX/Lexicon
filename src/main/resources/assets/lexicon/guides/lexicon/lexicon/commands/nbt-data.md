---
navigation:
  title: "NBT Data"
  icon: "minecraft:name_tag"
  position: 4
  parent: lexicon:commands.md
---

# NBT Data

The **Named Binary Tag (NBT)** is a tree data structure used by Minecraft in many save files to store arbitrary data. 

**Stringified Named Binary Tag (SNBT)**, also known as data tag, is often used in [*Commands*](./commands.md). 

A data tag consists of zero or more attribute-value pairs delimited by commas and enclosed in curly braces.

Each attribute-value pair consists of a tag name and the tag's value, separated by a colon. 

Some values, however, may be a compound tag and themselves contain attribute-value pairs, allowing a data tag to describe a hierarchical data structure. 

__Example:__ 

*{CustomName:'"Bob"', Invisible:true}*

__**References:**__
 
- [Basic Knowledge](https://minecraft.wiki/w/NBT_format)  
- [Commands with NBT tutorial](https://minecraft.fandom.com/wiki/Tutorials/Command_NBT_tags)
- [NBT for Block Entities](https://minecraft.fandom.com/wiki/Chunk_format#Block_entity_format)  
- [NBT for Items](https://minecraft.fandom.com/wiki/Player.dat_format#Item_structure)  
- [NBT for Item Entities](https://minecraft.fandom.com/wiki/Entity_format#Items_and_XPOrbs)  
- [NBT for Mobs](https://minecraft.fandom.com/wiki/Entity_format#Mobs)  
- [NBT for Projectiles](https://minecraft.fandom.com/wiki/Entity_format#Projectiles)   
- [NBT for Vehicles](https://minecraft.fandom.com/wiki/Entity_format#Vehicles)  
- [NBT for dynamic Tiles](https://minecraft.fandom.com/wiki/Entity_format#Dynamic_Tiles)   
- [NBT for other Entities](https://minecraft.fandom.com/wiki/Entity_format#Other)

## Data Components

**Data Components**, or simply **Components**, are structured data used to define and store various properties. 

They are used on items, where they are referred as item components or item stack components, and block entities, partially replacing **NBT format** on newer MC versions. 

More information can be found [here](https://minecraft.wiki/w/Data_component_format)

