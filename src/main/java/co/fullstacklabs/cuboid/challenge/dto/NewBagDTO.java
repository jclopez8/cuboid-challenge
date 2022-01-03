package co.fullstacklabs.cuboid.challenge.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import co.fullstacklabs.cuboid.challenge.model.Bag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NewBagDTO {
    @NotNull(message = "Bag volume can't be null.")
    private Double volume;

    @NotNull(message = "Bag title can't be null.")
    @Size(max = Bag.TITLE_MAX_SIZE, message = "Bag title maximum size is " + Bag.TITLE_MAX_SIZE + " characters.")
    private String title;

	public NewBagDTO(Double volume, String title) {
		this.volume = volume;
		this.title = title;
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
    
	public static NewBagDTOBuilder builder() {
		return new NewBagDTOBuilder();
	}
 
    public static class NewBagDTOBuilder{
	    	  private Double volume;

	    	  private String title;
	    	  	    	  
	    	  NewBagDTOBuilder(){
	    		  
	    	  }

			public NewBagDTOBuilder volume(Double volume) {
				this.volume = volume;
				return this;
			}

			public NewBagDTOBuilder title(String title) {
				this.title = title;
				return this;
			}
			
			public NewBagDTO build() {
				return new NewBagDTO(this.volume, this.title);
			}
	    	
	 }
	
    
}
