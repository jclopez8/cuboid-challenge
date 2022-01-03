package co.fullstacklabs.cuboid.challenge.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

import co.fullstacklabs.cuboid.challenge.model.Bag;

import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BagDTO {
    public BagDTO(Long id, @NotNull(message = "Bag volume can't be null.") Double volume,
			@NotNull(message = "Bag title can't be null.") @Size(min = 1, max = 100, message = "Bag title maximum size is 100 characters.") String title,
			Double payloadVolume, Double availableVolume, List<CuboidDTO> cuboids) {
		super();
		this.id = id;
		this.volume = volume;
		this.title = title;
		this.payloadVolume = payloadVolume;
		this.availableVolume = availableVolume;
		this.cuboids = cuboids;
	}


	private Long id;

    @NotNull(message = "Bag volume can't be null.")
    private Double volume;

    @NotNull(message = "Bag title can't be null.")
    @Size(min = 1, max = Bag.TITLE_MAX_SIZE, message = "Bag title maximum size is " + Bag.TITLE_MAX_SIZE + " characters.")
    private String title;
    private Double payloadVolume;
    private Double availableVolume;
    private List<CuboidDTO> cuboids;
       
    
    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Double getVolume() {
		return volume;
	}


	public void setVolume(Double volume) {
		this.volume = volume;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Double getPayloadVolume() {
		return payloadVolume;
	}


	public void setPayloadVolume(Double payloadVolume) {
		this.payloadVolume = payloadVolume;
	}


	public Double getAvailableVolume() {
		return availableVolume;
	}


	public void setAvailableVolume(Double availableVolume) {
		this.availableVolume = availableVolume;
	}


	public List<CuboidDTO> getCuboids() {
		return cuboids;
	}


	public void setCuboids(List<CuboidDTO> cuboids) {
		this.cuboids = cuboids;
	}


	public static BagDTOBuilder builder() {
    	return new BagDTOBuilder();
    }
    
    
    public static class BagDTOBuilder {
    	 private Long id;
         private Double volume;
   	     private String title;
    	 private Double payloadVolume;
    	 private Double availableVolume;
    	 private List<CuboidDTO> cuboids;
    	 
    	 
		public BagDTOBuilder id(Long id) {
			this.id = id;
			return this;
		}
		public BagDTOBuilder volume(Double volume) {
			this.volume = volume;
			return this;
		}
		public BagDTOBuilder title(String title) {
			this.title = title;
			return this;
		}
		public BagDTOBuilder payloadVolume(Double payloadVolume) {
			this.payloadVolume = payloadVolume;
			return this;
		}
		public BagDTOBuilder availableVolume(Double availableVolume) {
			this.availableVolume = availableVolume;
			return this;
		}
		public BagDTOBuilder  cuboids(List<CuboidDTO> cuboids) {
			this.cuboids = cuboids;
			return this;
		}
    	 
		public BagDTO build() {
			return new BagDTO(id, availableVolume, title, availableVolume, availableVolume, cuboids);
		}
    	 
    	
    }
    
}
