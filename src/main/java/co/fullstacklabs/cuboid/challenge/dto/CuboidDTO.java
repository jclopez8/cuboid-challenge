package co.fullstacklabs.cuboid.challenge.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CuboidDTO {
    public CuboidDTO(Long id, @NotNull(message = "Cuboid width can't be null.") Float width,
			@NotNull(message = "Cuboid height can't be null.") Float height,
			@NotNull(message = "Cuboid depth can't be null.") Float depth, Double volume,
			@NotNull(message = "Cuboid related bag can't be null.") Long bagId) {
		super();
		this.id = id;
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.volume = volume;
		this.bagId = bagId;
	}


	private Long id;

    @NotNull(message = "Cuboid width can't be null.")
    private Float width;

    @NotNull(message = "Cuboid height can't be null.")
    private Float height;

    @NotNull(message = "Cuboid depth can't be null.")
    private Float depth;

    private Double volume;

    @NotNull(message = "Cuboid related bag can't be null.")
    private Long bagId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getWidth() {
		return width;
	}

	public void setWidth(Float width) {
		this.width = width;
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public Float getDepth() {
		return depth;
	}

	public void setDepth(Float depth) {
		this.depth = depth;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public Long getBagId() {
		return bagId;
	}

	public void setBagId(Long bagId) {
		this.bagId = bagId;
	}
    
	public static CuboidDTOBuilder builder() {
		return new CuboidDTOBuilder();
	}
    
    public static class CuboidDTOBuilder{
    	 private Long id;   	   
		 private Float width;
         private Float height;
         private Float depth;
         private Double volume;
    	 private Long bagId;
    	 
			public CuboidDTOBuilder id(Long id) {
				this.id = id;
				return this;
			}
			public CuboidDTOBuilder width(Float width) {
				this.width = width;
				return this;
			}
			
		   public CuboidDTOBuilder height(Float height) {
				this.height = height;
				return this;
			}
			public CuboidDTOBuilder depth(Float depth) {
				this.depth = depth;
				return this;
			}
			public CuboidDTOBuilder volume(Double volume) {
				this.volume = volume;
				return this;
			}
			public CuboidDTOBuilder bagId(Long bagId) {
				this.bagId = bagId;
				return this;
			}
			
			public CuboidDTO build() {
				return new CuboidDTO(this.id, this.width, this.height, this.depth, this.volume, this.bagId);
			}
    	
    	
    }
    
    
}
